package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:00
 * @Version 1.0
 */
@Data
public class DataUpdateCondition implements Serializable {


    private Integer dataUpdate;
    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private Date dateId;

}
