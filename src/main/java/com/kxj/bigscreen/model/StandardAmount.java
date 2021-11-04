package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:38
 * @Version 1.0
 */
@Data
public class StandardAmount implements Serializable {

    private Integer id;
    private String type;
    private String item;
    private String amount;
    private String updateTime;
}
