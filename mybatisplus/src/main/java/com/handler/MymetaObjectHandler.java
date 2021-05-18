package com.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Create By C on 2021-05-14
 * @author changtao
 */


@Slf4j
@Component
public class MymetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {


        log.info("开始插入数据");


        this.strictInsertFill(metaObject,"createTime", Date.class, new Date());
        this.strictInsertFill(metaObject,"updateTime",Date.class, new Date());
/*
        Object createTime = getFieldValByName("createTime", metaObject);


        log.info((String) createTime);

        if (createTime ==null) {

            setFieldValByName("createTime", new Date(), metaObject);

        }*/
//        this.setFieldValByName("updateTime",new Date(), metaObject);



    }

    @Override
    public void updateFill(MetaObject metaObject) {


        this.strictUpdateFill(metaObject,"updateTime",Date.class, new Date());

        /*
        Object updateTime = getFieldValByName("createTime", metaObject);



        if (updateTime == null) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }*/

//        log.info("begin update");
    }
}
