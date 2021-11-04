package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/20 12:10
 * @Version 1.0
 */
@Data
public class Chart {
    private Integer dataTotal;
    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private Date dateId;
}
