package com.example.demo.service.impl;

import com.example.demo.mybaties.mapper.IadtCpiNaciTotalMapper;
import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample;
import com.example.demo.service.IadtCpiNaciTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

@Service
public class IadtCpiNaciTotalServiceImpl implements IadtCpiNaciTotalService {

    @Autowired
    private IadtCpiNaciTotalMapper iadtCpiNaciTotalMapper;

    @Transactional
    @Override
    public Integer addOrInsert(IadtCpiNaciTotal iadtCpiNaciTotal)  {
        if (iadtCpiNaciTotal.getId() ==null){
            iadtCpiNaciTotalMapper.insertSelective(iadtCpiNaciTotal);
            return iadtCpiNaciTotal.getId();
        } else {
            return iadtCpiNaciTotalMapper.updateByPrimaryKeySelective(iadtCpiNaciTotal);
        }

    }

    @Override
    public IadtCpiNaciTotal byId(Integer id) {
        return iadtCpiNaciTotalMapper.selectByPrimaryKey(id);
    }
    @Transactional
    @Override
    public Integer del(Integer id){
        return iadtCpiNaciTotalMapper.deleteByPrimaryKey(id);
    }
}
