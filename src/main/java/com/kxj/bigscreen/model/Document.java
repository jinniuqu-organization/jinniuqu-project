package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:10
 * @Version 1.0
 */
@Data
public class Document implements Serializable {

    private Integer departmentId;
    private String wordType;
    private Integer status;
}
