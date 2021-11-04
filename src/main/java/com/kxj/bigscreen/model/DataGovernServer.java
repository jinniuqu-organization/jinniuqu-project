package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:38
 * @Version 1.0
 */
@Data
public class DataGovernServer implements Serializable {

    private Integer id;
    private String type;
    private Integer amount;
    private String updateTime;
}
