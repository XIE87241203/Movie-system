package com.xie.dao;

import org.apache.ibatis.annotations.Param;

public interface IConfigDao {

    String getConfigConstant(String name);

    int setConfigConstant(@Param("name") String name,@Param("value") String value);
}
