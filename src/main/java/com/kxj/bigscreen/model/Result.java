package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/2 10:59
 * @Version 1.0
 */
@Data
public class Result implements Serializable {

    private String tableName;
    private Person person;
    private Legalperson legalperson;
    private String idCard;
    private String unifyCode;


}
