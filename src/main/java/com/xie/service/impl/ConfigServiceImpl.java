package com.xie.service.impl;

import com.xie.dao.IConfigDao;
import com.xie.model.Config;
import com.xie.service.IConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("configService")
public class ConfigServiceImpl extends BaseImpl implements IConfigService {

    @Resource
    private IConfigDao configDao;

    @Override
    public Config getConfig() {
        Config config = new Config();
        config.setHost1(configDao.getConfigConstant("host1"));
        config.setHost2(configDao.getConfigConstant("host2"));
        config.setHost3(configDao.getConfigConstant("host3"));
        config.setHost4(configDao.getConfigConstant("host4"));
        config.setSystem_path(configDao.getConfigConstant("system_path"));
        return config;
    }

    @Override
    public int setConfig(Config config) {
        int changeNum = 0;
        changeNum += configDao.setConfigConstant("host1", config.getHost1());
        changeNum += configDao.setConfigConstant("host2", config.getHost2());
        changeNum += configDao.setConfigConstant("host3", config.getHost3());
        changeNum += configDao.setConfigConstant("host4", config.getHost4());
        changeNum += configDao.setConfigConstant("system_path", config.getSystem_path());
        return changeNum;
    }
}
