package com.xie.service.impl;

import com.xie.dao.IUserDao;
import com.xie.model.db.User;
import com.xie.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends BaseImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(String userName) {
        return userDao.selectUser(userName);
    }

    @Override
    public void setToken(int id, String token) {
        userDao.setToken(id,token);
    }
}
