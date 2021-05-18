package com.response;

/**
 * Create By C on 2021-05-18
 */


public class BaseResponse {

    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应结果
     */
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(BaseErrorInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.msg = errorInfo.getResultMsg();
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static BaseResponse success(Object data) {
        BaseResponse resultBase = new BaseResponse();
        resultBase.setCode(CommonEnum.SUCCESS.getResultCode());
        resultBase.setMsg(CommonEnum.SUCCESS.getResultMsg());
        resultBase.setData(data);
        return resultBase;
    }

    /**
     * 成功
     *
     * @return
     */
    public static BaseResponse success() {
        BaseResponse resultBase = new BaseResponse();
        resultBase.setCode(CommonEnum.SUCCESS.getResultCode());
        resultBase.setMsg(CommonEnum.SUCCESS.getResultMsg());
        resultBase.setData(null);
        return resultBase;
    }

    /**
     * 失败
     */
    public static BaseResponse error(BaseErrorInterface errorInfo) {
        BaseResponse resultBase = new BaseResponse();
        resultBase.setCode(errorInfo.getResultCode());
        resultBase.setMsg(errorInfo.getResultMsg());
        resultBase.setData(null);
        return resultBase;
    }

    /**
     * 失败
     */
    public static BaseResponse error(String code, String message) {
        BaseResponse resultBase = new BaseResponse();
        resultBase.setCode(code);
        resultBase.setMsg(message);
        resultBase.setData(null);
        return resultBase;
    }

    /**
     * 失败
     */
    public static BaseResponse error(String message) {
        BaseResponse resultBase = new BaseResponse();
        resultBase.setCode("-1");
        resultBase.setMsg(message);
        resultBase.setData(null);
        return resultBase;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
