package com.response;

/**
 * Create By C on 2021-05-18
 * @author changtao
 *
 * 错误基础接口
 */
public interface BaseErrorInterface {


    /**
     * 错误代码
     * @return
     */
    String getResultCode();


    /**
     * 错误描述
     * @return
     */
    String getResultMsg();




}
