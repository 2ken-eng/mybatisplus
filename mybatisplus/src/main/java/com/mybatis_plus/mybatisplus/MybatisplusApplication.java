package com.mybatis_plus.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import com.handler.MymetaObjectHandler;
import com.response.MyExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author changtao
 */
@MapperScan(basePackages = {"com.mapper","com.ken.role.mapper"})
@SpringBootApplication

//如果不加以下注解；访问controller会提示404错误
@ComponentScan(basePackages = "com.ken.role.controller")
public class MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
    }


    @Bean
    MymetaObjectHandler mymetaObjectHandler(){

        return new MymetaObjectHandler();
    }


    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }


    @Bean
    MyExceptionHandler myExceptionHandler(){

        return  new MyExceptionHandler();
    }


}
