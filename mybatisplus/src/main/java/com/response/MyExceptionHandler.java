package com.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Create By C on 2021-05-18
 * @author changtao
 */


@ResponseBody
@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public BaseResponse MyExceptionHandle(MyException e) {

        log.error("发生业务异常！原因是：{}", e.getErrorMsg());

        return BaseResponse.error(e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public BaseResponse nullExceptionHandler(NullPointerException e) {
        log.error("发生空指针异常！原因是: ", e);
        return BaseResponse.error(CommonEnum.BODY_NOT_MATCH);
    }


    /**
     * 处理其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse exceptionHandler(Exception e) {
        log.error("未知异常！原因是: ", e);
        return BaseResponse.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }

    /**
     * 处理其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public BaseResponse RuntimeException(Exception e) {
        log.error("未知异常！原因是: ", e);
        return BaseResponse.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }


}
