package com.xie.controller.api;

import com.alibaba.fastjson.JSON;
import com.xie.model.Config;
import com.xie.model.ResultModel;
import com.xie.service.IConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/config")
public class ConfigApiController extends BaseApiController {
    @Resource
    private IConfigService configService;

    @RequestMapping(value = "/set.do", method = RequestMethod.POST)
    public @ResponseBody
    ResultModel setConfig(@RequestBody String config) {
        ResultModel resultModel;
        Config configModel = JSON.parseObject(config, Config.class);
        if (configService.setConfig(configModel) > 0) {
            resultModel = getSuccessResult(getConfig());
        } else {
            resultModel = getErrorResult("设置失败");
        }
        return resultModel;
    }

    @RequestMapping("/get.do")
    public @ResponseBody
    ResultModel getConfig() {
        return getSuccessResult(configService.getConfig());
    }
}
