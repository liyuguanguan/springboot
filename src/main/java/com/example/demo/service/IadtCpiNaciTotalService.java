package com.example.demo.service;

import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import org.springframework.stereotype.Service;

import java.text.ParseException;

public interface IadtCpiNaciTotalService {

    public Integer addOrInsert(IadtCpiNaciTotal iadtCpiNaciTotal) ;

    public IadtCpiNaciTotal byId(Integer id);

    public Integer del(Integer id);

}