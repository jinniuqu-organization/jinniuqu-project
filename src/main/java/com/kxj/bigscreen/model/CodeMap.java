package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/3 14:41
 * @Version 1.0
 */
@Data
public class CodeMap implements Serializable {

    private String type;
    private Integer item;
    private Integer amount;
    private String updateTime;
}
