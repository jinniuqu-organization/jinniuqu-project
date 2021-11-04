package com.kxj.bigscreen.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/9/10 12:18
 * @Version 1.0
 */
@Data
public class Person {

    @Id
    /**人口库唯一编号*/
    private String personId;

    private String department;
    /**身份证号码*/
    private String idCard;



    /**姓名*/
    private String name;



    /**性别*/
    private String sex;


    /**民族*/
    private String nationality;



    /**出生日期*/
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
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



    /**数据更新时间*/
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;



    /**数据版本*/
    private Integer dataVersion;
}
