package com.xie.dao;

import com.xie.model.db.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    User selectUser(String user_name);

    int setToken(@Param("id") int id,@Param("token") String token);
}
