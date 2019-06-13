package com.xie.controller.api;

import com.xie.controller.BaseController;
import com.xie.model.ResultModel;
import org.springframework.util.StringUtils;

public class BaseApiController extends BaseController {

    static ResultModel getSuccessResult(Object data){
        ResultModel result = new ResultModel(data);
        result.setResultCode(ResultModel.RESULT_CODE_SUCCEED);
        result.setResultMsg("success");
        return result;
    }


    static ResultModel getErrorResult(String msg){
        ResultModel result = new ResultModel(null);
        result.setResultCode(ResultModel.RESULT_CODE_ERROR);
        result.setResultMsg("error:" + msg);
        return result;
    }

    //检验多个字符串中，是否有为空的
    public static ResultModel isEmpty(String...keys){
        if (!StringUtils.isEmpty(keys)){
            for (String key :keys) {
                if (StringUtils.isEmpty(key)) {
                    return getErrorResult("参数不能为空");
                }
            }
        }else {
            return getErrorResult("参数不能为空");
        }
        return null;
    }
}
