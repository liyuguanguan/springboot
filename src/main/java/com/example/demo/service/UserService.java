package com.example.demo.service;

import com.example.demo.mybaties.model.User;

import java.util.List;

public interface UserService {

    public int addUser(User user);

    public List<User> get(User user);
}
