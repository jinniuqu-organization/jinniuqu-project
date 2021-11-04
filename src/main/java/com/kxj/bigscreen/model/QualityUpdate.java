package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 13:55
 * @Version 1.0
 */
@Data
public class QualityUpdate implements Serializable {

    private Integer id;
    private String department;
    private String type;
    private Integer amount;
    private String sourceHold;
    private String optimizeHold;
    private String qualityPromote;
    private String updateTime;
}
