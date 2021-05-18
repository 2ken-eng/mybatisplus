package com.Modle;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Create By C on 2021-05-14
 * @author changtao
 */




@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Integer id;
    private  String name;
    private Integer age;
    private String email;



    @TableField(fill = FieldFill.INSERT)
   private Date createTime;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
