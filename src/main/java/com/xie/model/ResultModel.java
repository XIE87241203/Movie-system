package com.xie.model;

public class ResultModel {
    public static final int RESULT_CODE_SUCCEED = 200;
    public static final int RESULT_CODE_ERROR = 100;

    private int resultCode;
    private String resultMsg;
    private Object result;

    public ResultModel(Object result) {
        this.result = result;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
