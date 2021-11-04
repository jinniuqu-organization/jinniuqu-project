package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class Person1 {

    private Integer pageNum;

    private String id;

    private String idcard;

    private String name;

    private String sex;
    //户籍非户籍
    private String domicile;

    private String telephone;
    //家庭住址
    private String presentAddress;
    //户籍住址
    private String rprAddress;

    //查询用的type
    private String type;

    //公共参数
    private String parameter;
}
