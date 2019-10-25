package com.example.demo.service;

import com.example.demo.dto.TotalDetailDTO;
import com.example.demo.mybaties.model.IadtCpiNaciDetail;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IadtCpiNaciDetailService {


    public IadtCpiNaciDetail byid(Integer id);

    public Map get(Date date, String key) throws ParseException;

    public int insert(IadtCpiNaciDetail iadtCpiNaci,String[] str);

    public int update(IadtCpiNaciDetail iadtCpiNaci, String[] str);

    public int delete(int id);

    public List<TotalDetailDTO> getAll(int page, int limit);
}
