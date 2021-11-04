package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:28
 * @Version 1.0
 */
@Data
public class Standard implements Serializable {

    private Integer id;
    private Integer pageStart;
    private String firstTitle;
    private String secondTitle;
    private String updateTime;
}
