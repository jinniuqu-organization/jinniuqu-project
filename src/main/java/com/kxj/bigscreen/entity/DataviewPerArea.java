package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class DataviewPerArea {

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    private String areaId;

    private String areaName;

    //总人口
    private Integer totalCnt;

    //户籍人口
    private Integer regiterCnt;

    //实有人口
    private Integer actualCnt;

    //流动人口
    private Integer floatCnt;

}
