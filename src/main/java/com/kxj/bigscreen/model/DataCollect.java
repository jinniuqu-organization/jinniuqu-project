package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:03
 * @Version 1.0
 */
@Data
public class DataCollect implements Serializable {

    private Integer sourceAmount;
    private Integer tableAmount;
    private Integer itemAmount;
    private Integer dataAmount;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;
}
