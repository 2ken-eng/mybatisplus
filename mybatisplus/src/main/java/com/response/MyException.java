package com.response;

/**
 * Create By C on 2021-05-18
 * @author changtao
 */
public class MyException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    /**
     * 错误码
     */
    protected String errorCode;

    /**
     * 错误描述
     */

    protected String errorMsg;


    public MyException(){
        super();
    }


    public MyException(BaseErrorInterface baseErrorInterface)
    {

        super(baseErrorInterface.getResultCode());



        this.errorCode = baseErrorInterface.getResultCode();

        this.errorMsg = baseErrorInterface.getResultMsg();
    }


    public MyException(String errorMsg){
        super(errorMsg);
        this.errorMsg = errorMsg;
    }


    public MyException(String errorCode, String errorMsg)
    {
        super(errorCode);

        this.errorCode = errorCode;
        this.errorMsg = errorMsg;


    }

    public String getErrorCode()
    {

        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
