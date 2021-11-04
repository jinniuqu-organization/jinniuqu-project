package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2020/3/25 13:44
 * @Version 1.0
 */

@Data
public class Time {

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateTime;
}
