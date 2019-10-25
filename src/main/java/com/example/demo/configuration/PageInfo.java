package com.example.demo.configuration;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class PageInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int code;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;

    //由于startRow和endRow不常用，这里说个具体的用法
    //可以在页面中"显示startRow到endRow 共size条数据"

    //当前页面第一个元素在数据库中的行号
    private int startRow;
    //当前页面最后一个元素在数据库中的行号
    private int endRow;
    //总记录数
    private long count;
    //总页数
    private int pages;
    //结果集
    @JSONField(name="data")
    private List<T> data;

//    //前一页
//    private int prePage;
//    //下一页
//    private int nextPage;


    private int[] navigatepageNums;
    //导航条上的第一页
    private int navigateFirstPage;
    //导航条上的最后一页
    private int navigateLastPage;

    public PageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param data
     */
    public PageInfo(List<T> data) {
        this(data, 8);
    }

    /**
     * 包装Page对象
     *
     * @param data          page结果
     * @param navigatePages 页码数量
     */
    public PageInfo(List<T> data, int navigatePages) {
        if (data instanceof Page) {
            Page page = (Page) data;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();

            this.pages = page.getPages();
            this.data = page;
            this.size = page.size();
            this.count = page.getTotal();
            //由于结果是>startRow的，所以实际的需要+1
            if (this.size == 0) {
                this.startRow = 0;
                this.endRow = 0;
            } else {
                this.startRow = page.getStartRow() + 1;
                //计算实际的endRow（最后一页的时候特殊）
                this.endRow = this.startRow - 1 + this.size;
            }
        } else if (data instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = data.size();

            this.pages = this.pageSize > 0 ? 1 : 0;
            this.data = data;
            this.size = data.size();
            this.count = data.size();
            this.startRow = 0;
            this.endRow = data.size() > 0 ? data.size() - 1 : 0;
        }
    }




    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public long getTotal() {
        return count;
    }

    public void setTotal(long count) {
        this.count = count;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return data;
    }

    public void setList(List<T> data) {
        this.data = data;
    }

    @Deprecated
    // firstPage就是1, 此函数获取的是导航条上的第一页, 容易产生歧义
    public int getFirstPage() {
        return navigateFirstPage;
    }

    @Deprecated
    public void setFirstPage(int firstPage) {
        this.navigateFirstPage = firstPage;
    }



    @Deprecated
    // 请用getPages()来获取最后一页, 此函数获取的是导航条上的最后一页, 容易产生歧义.
    public int getLastPage() {
        return navigateLastPage;
    }

    @Deprecated
    public void setLastPage(int lastPage) {
        this.navigateLastPage = lastPage;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
