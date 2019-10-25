package com.example.demo.service;

import com.example.demo.mybaties.model.IadtCpiNaci;

import java.util.List;

public interface IadtCpiNaciService {

    public List<IadtCpiNaci> get();

    public int insertOrUpdate(IadtCpiNaci iadtCpiNaci);

    public int delete(int id);

}