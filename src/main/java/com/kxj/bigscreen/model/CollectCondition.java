package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 10:48
 * @Version 1.0
 */
@Data
@Slf4j
public class CollectCondition implements Serializable {

    private Integer departmentId;
    private String department;
    private Integer tableAmount;
    private Integer dataItem;
    private Integer amount;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date joinDate;
    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private String updateTime;

}
