package com.example.demo.service.impl;

import com.example.demo.mybaties.mapper.IadtCpiNaciMapper;
import com.example.demo.mybaties.model.IadtCpiNaci;
import com.example.demo.mybaties.model.IadtCpiNaciExample;
import com.example.demo.service.IadtCpiNaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class IadtCpiNaciServiceImpl implements IadtCpiNaciService {

    @Autowired
    private IadtCpiNaciMapper iadtCpiNaciMapper;

    /**
     * 查询导航页
     * @return
     */
    @Override
    public List<IadtCpiNaci> get() {
        IadtCpiNaciExample iadtCpiNaciExample = new IadtCpiNaciExample();
        iadtCpiNaciExample.createCriteria().andIdIsNotNull();
        return iadtCpiNaciMapper.selectByExample(iadtCpiNaciExample);
    }

    /**
     * 增加或者修改导航信息
     * @param iadtCpiNaci
     * @return
     */
    @Transactional
    @Override
    public int insertOrUpdate(IadtCpiNaci iadtCpiNaci) {
        Date date = new Date();
        iadtCpiNaci.setUpdateTime(date);
        // 新增
        if (iadtCpiNaci.getId()==null){
            iadtCpiNaci.setCreateTime(date);
            return iadtCpiNaciMapper.insert(iadtCpiNaci);
        } else { //修改
            return iadtCpiNaciMapper.updateByPrimaryKeySelective(iadtCpiNaci);
        }
    }

    @Transactional
    @Override
    public int delete(int id) {
        return iadtCpiNaciMapper.deleteByPrimaryKey(id);
    }


}
