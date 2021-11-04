package com.kxj.bigscreen.model;


import lombok.Data;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/9 9:24
 * @Version 1.0
 */
@Data
public class PersonStatus {

    /**身份证号码*/
    private String idCard;

    /**姓名*/
    private String name;


    /**性别*/
    private String sex;


    /**民族*/
    private String nationality;


    private String birthDate;



    /**文化程度*/
    private String eduLevel;



    /**政治面貌*/
    private String polity;



    /**婚姻状况*/
    private String marriageType;



    /**户籍地址*/
    private String rprAddress;



    /**现居住地址*/
    private String presentAddress;


    /**个人户籍状态*/
    private String rprStatus;


    private String updateTime;


}
