package com.response;

/**
 * Create By C on 2021-05-18
 * @author changtao
 *
 */
public enum CommonEnum  implements BaseErrorInterface {

    //数据操作错误定义

    SUCCESS("200","请求成功"),
    BODY_NOT_MATCH("400", "请求的数据格式不符"),
    SIGNATURE_NOT_MATCH("401", "请求的数字签名不匹配"),
    NOT_FOUND("404", "未找到该资源"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误"),
    SERVER_BUSY("503", "服务器正忙，请稍后再试");




    /**
     * 错误码
     */
    private String errCode;


    /**
     * 错误描述
     */
    private String errMsg;

    CommonEnum(String errCode,    String errMsg) {

        this.errCode = errCode;

        this.errMsg = errMsg;
    }


    @Override
    public String getResultCode() {
        return errCode;
    }

    @Override
    public String getResultMsg() {
        return errMsg;
    }
}
