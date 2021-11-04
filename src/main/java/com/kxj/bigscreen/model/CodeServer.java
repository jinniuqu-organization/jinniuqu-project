package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 9:53
 * @Version 1.0
 */
@Data
public class CodeServer implements Serializable {

    private Integer id;
    private String status;
    private String type;
    private Integer item;
    private Integer amount;
    private String updateTime;
}
