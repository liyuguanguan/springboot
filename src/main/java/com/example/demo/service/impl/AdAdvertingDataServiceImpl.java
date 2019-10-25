package com.example.demo.service.impl;

import com.example.demo.mybaties.mapper.AdAdvertingDataMapper;
import com.example.demo.mybaties.model.AdAdvertingData;
import com.example.demo.mybaties.model.AdAdvertingDataExample;
import com.example.demo.service.AdAdvertingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class AdAdvertingDataServiceImpl implements AdAdvertingDataService {

    @Autowired
    private AdAdvertingDataMapper adAdvertingDataMapper;

    @Override
    public List<AdAdvertingData> get() {
        AdAdvertingDataExample adAdvertingDataExample = new AdAdvertingDataExample();
        adAdvertingDataExample.createCriteria().andIdIsNotNull();
        return adAdvertingDataMapper.selectByExample(adAdvertingDataExample);
    }
}