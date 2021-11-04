package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:00
 * @Version 1.0
 */
@Data
public class DataUpdateCondition implements Serializable {

    private Integer departmentId;
    private Integer amount;
    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private Date updateTime;
}
