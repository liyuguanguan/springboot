package com.example.demo.service.impl;


import com.example.demo.dto.TotalDTO;
import com.example.demo.dto.TotalDetailDTO;
import com.example.demo.mybaties.mapper.IadtCpiNaciDetailMapper;
import com.example.demo.mybaties.mapper.IadtCpiNaciTotalMapper;
import com.example.demo.mybaties.model.IadtCpiNaciDetail;
import com.example.demo.mybaties.model.IadtCpiNaciDetailExample;
import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample;
import com.example.demo.service.IadtCpiNaciDetailService;
import com.example.demo.service.IadtCpiNaciTotalService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class IadtCpiNaciDetailServiceImpl implements IadtCpiNaciDetailService {

    @Autowired
    public IadtCpiNaciDetailMapper iadtCpiNaciDetailMapper;

    @Autowired
    public IadtCpiNaciTotalMapper iadtCpiNaciTotalMapper;

    @Autowired
    private IadtCpiNaciTotalService iadtCpiNaciTotalService;

//    private IadtCpiNaciDetailExample iadtCpiNaciDetailExample = new IadtCpiNaciDetailExample();

    @Override
    public IadtCpiNaciDetail byid(Integer id){
       return iadtCpiNaciDetailMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取明细
     * @param date
     * @return
     * @throws ParseException
     */
    @Override
    public Map get(Date date,String key) {
        IadtCpiNaciTotalExample naciTotalExample = new IadtCpiNaciTotalExample();
        naciTotalExample.setOrderByClause("id desc");
        naciTotalExample.createCriteria().andBeginTimeLessThanOrEqualTo(date).andEndTimeGreaterThanOrEqualTo(date).andTotalKeyEqualTo(key);
        // 获取到头信息
        List<IadtCpiNaciTotal> totalLists = iadtCpiNaciTotalMapper.selectByExample(naciTotalExample);
        Map<TotalDTO, List> map = new HashMap<>();
        if (!CollectionUtils.isEmpty(totalLists)){
            for (IadtCpiNaciTotal totalList:totalLists){
                TotalDTO totalDto = new TotalDTO();
                totalDto.setIadtcpiadtyp(totalList.getIadtcpiadtyp());
                totalDto.setIadtcpiadver(totalList.getIadtcpiadver());
                IadtCpiNaciDetailExample iadtCpiNaciDetailExample = new IadtCpiNaciDetailExample();
                iadtCpiNaciDetailExample.createCriteria().andTotalIdEqualTo(totalList.getId());
                iadtCpiNaciDetailExample.setOrderByClause("id desc");
                map.put(totalDto,iadtCpiNaciDetailMapper.selectByExample(iadtCpiNaciDetailExample)) ;
            }
        }

        return map;
    }

    @Transactional
    @Override
    public int insert(IadtCpiNaciDetail iadtCpiNaci,String[] str) {
        Date date = new Date();
        iadtCpiNaci.setUpdateTime(date);
        iadtCpiNaci.setCreateTime(date);
        for (int i=0;i<str.length;i++){
            iadtCpiNaci.setIadtcpiadurl(str[i]);
            iadtCpiNaci.setIadtcpiadclk(str[++i]);
             iadtCpiNaciDetailMapper.insertSelective(iadtCpiNaci);
        }
        return 1;
    }

    @Transactional
    @Override
    public int update(IadtCpiNaciDetail iadtCpiNaci,String[] str) {
        Date date = new Date();
        iadtCpiNaci.setUpdateTime(date);
        for (int i=0;i<str.length;i++){
            iadtCpiNaci.setIadtcpiadurl(str[i]);
            iadtCpiNaci.setIadtcpiadclk(str[++i]);
        }
        return iadtCpiNaciDetailMapper.updateByPrimaryKey(iadtCpiNaci);
    }


    @Transactional
    @Override
    public int delete(int id) {
        IadtCpiNaciDetail cpiNaciDetail = iadtCpiNaciDetailMapper.selectByPrimaryKey(id);

        IadtCpiNaciDetailExample example = new IadtCpiNaciDetailExample();
        example.createCriteria().andTotalIdEqualTo(cpiNaciDetail.getTotalId());
        List<IadtCpiNaciDetail> list = iadtCpiNaciDetailMapper.selectByExample(example);
        if (list.size()<=1){
            iadtCpiNaciTotalService.del(cpiNaciDetail.getTotalId());
        }
        return iadtCpiNaciDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TotalDetailDTO> getAll(int page,int limit){
        PageHelper.startPage(page, limit);
        List<TotalDetailDTO> list =  iadtCpiNaciDetailMapper.selectTotalDetailDTO();
        return list;
    }


}
