package com.xie.dao;

import com.xie.model.User;

public interface IUserDao {
    User selectUser(long id);
}
