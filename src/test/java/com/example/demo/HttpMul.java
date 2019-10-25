package com.example.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.event.Level;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpMul {


    //    private static PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
    static final int timeOut = 10 * 1000;
    private static CloseableHttpClient httpClient = null;
    private final static Object syncLock = new Object();

    private static void config(HttpRequestBase httpRequestBase) {
        // 设置Header等
        // httpRequestBase.setHeader("User-Agent", "Mozilla/5.0");
        // httpRequestBase
        // .setHeader("Accept",
        // "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        // httpRequestBase.setHeader("Accept-Language",
        // "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");// "en-US,en;q=0.5");
        // httpRequestBase.setHeader("Accept-Charset",
        // "ISO-8859-1,utf-8,gbk,gb2312;q=0.7,*;q=0.7");

        // 配置请求的超时设置
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(timeOut)
                //建立链接时间也就是TCP三次握手水花四溅
                .setConnectTimeout(timeOut)
                //等待数据传输的时间socketTimeout是等待数据的时间或者两个包之间的间隔时间。
                .setSocketTimeout(timeOut).build();

        httpRequestBase
                .setConfig(requestConfig);
    }


    // HTTP://WWW.BAIDU.COM
    public static CloseableHttpClient getHttpClient(String url) {
        String hostname = url.split("/")[2];
        int port = 80;
        if (hostname.contains(":")) {
            String[] arr = hostname.split(":");
            hostname = arr[0];
            port = Integer.parseInt(arr[1]);
        }

        // 双重校验锁
        if (httpClient == null) {
            synchronized (syncLock) {
                if (httpClient == null) {
                    httpClient = createHttpClient(200, 40, 100, hostname, port);
                }
            }
        }
        return httpClient;
    }

    /**
     *
     * @param maxTotal
     * @param maxPerRoute
     * @param maxRoute
     * @param hostname
     * @param port
     * @return
     */
    public static CloseableHttpClient createHttpClient(int maxTotal ,int maxPerRoute,int maxRoute,String hostname,int port){
        //用于创建普通（未加密）套接字的默认类
        ConnectionSocketFactory connectionSocketFactory = PlainConnectionSocketFactory.getSocketFactory();
        //创建加密的套接字
        LayeredConnectionSocketFactory layeredConnectionSocketFactory = SSLConnectionSocketFactory.getSocketFactory();

        Registry registry = RegistryBuilder.create().register("http", connectionSocketFactory).register("https",layeredConnectionSocketFactory).build();

        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(registry);

        // 最大连接数
        poolingHttpClientConnectionManager.setMaxTotal(maxTotal);
        // 路由最大连接数
        //路由:包含的数据有目标主机、本地地址、代理链、是否tunnulled、是否layered、是否是安全路由
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(maxPerRoute);

        HttpHost httpHost = new HttpHost(hostname, port);
        // 某个站点或者某个ip的最大连接个数
        poolingHttpClientConnectionManager.setMaxPerRoute(new HttpRoute(httpHost),maxRoute);

        HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {

                // 重试一次
                if (executionCount>=1){
                    return false;
                }
                if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
                    return true;
                }
                if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
                    return false;
                }
                if (exception instanceof InterruptedIOException) {// 超时
                    return false;
                }
                if (exception instanceof UnknownHostException) {// 目标服务器不可达
                    return false;
                }
                if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
                    return false;
                }
                if (exception instanceof SSLException) {// SSL握手异常
                    return false;
                }

                HttpClientContext clientContext = HttpClientContext.adapt(context);
                HttpRequest request = clientContext.getRequest();

                // 如果请求是幂等的，就再次尝试
                if (!(request instanceof HttpEntityEnclosingRequest)) {
                    return true;
                }
                return false;
            }


        };

        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(poolingHttpClientConnectionManager).setRetryHandler(httpRequestRetryHandler).build();

        return httpClient;
    }


    /**
     * 设置post参数
     * @param post
     * @param paramas
     */
    private static void setPostParams(HttpPost post ,Map<String,Object> paramas) {

        List<NameValuePair> nameValuePairList = new ArrayList<>();
        Set<String> keySets = paramas.keySet();
        for (String key : keySets) {
            nameValuePairList.add(new BasicNameValuePair(key,paramas.get(key).toString()));
        }

        try {
            post.setEntity(new UrlEncodedFormEntity(nameValuePairList,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


    /**
     * post请求获取返回内容
     * @param url
     * @param params
     * @return
     */
    public static String post(String url,Map<String,Object> params)  throws IOException{
        HttpPost httpPost = new HttpPost(url);
        config(httpPost);
        setPostParams(httpPost,params);
        CloseableHttpResponse response = null;
        try {
            response = getHttpClient(url).execute(httpPost, HttpClientContext.create());
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity,"utf-8").toString();
            // 关闭流
            EntityUtils.consume(entity);
            return result;
        } catch (IOException e) {
            throw e;
        }
        finally {
            try {
                if (response != null){
                    response.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * get 返回内容
     * @param url
     * @return
     */
    public static String get(String url) {
        HttpGet httpget = new HttpGet(url);
        config(httpget);
        CloseableHttpResponse response = null;
        try {
            response = getHttpClient(url).execute(httpget,
                    HttpClientContext.create());
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            EntityUtils.consume(entity);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String[] args) {

        System.out.println(get("https://www.baidu.com"));
        System.out.println(get("http://www.sohu.com"));

    }
}

