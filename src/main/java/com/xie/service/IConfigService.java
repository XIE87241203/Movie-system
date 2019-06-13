package com.xie.service;


import com.xie.model.Config;

public interface IConfigService {

    Config getConfig();

    int setConfig(Config config);
}
