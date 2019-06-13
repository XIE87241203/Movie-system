package com.xie.service;


import com.xie.model.User;

public interface IUserService {

    User selectUser(String userName);

    void setToken(int id, String token);
}
