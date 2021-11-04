package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 13:40
 * @Version 1.0
 */
@Data
public class DataQuality implements Serializable {

    private Integer ruleGross;
    private String threeMonthHold;
    private Integer modelGross;
    private Integer dataGross;
    private Integer problem;
    private String holdGross;
    private Integer processed;
    private String holdProblem;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;
}
