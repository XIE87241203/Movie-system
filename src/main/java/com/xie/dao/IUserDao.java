package com.xie.dao;

import com.xie.model.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    User selectUser(String user_name);

    void setToken(@Param("id") int id,@Param("token") String token);
}
