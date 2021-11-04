package com.kxj.bigscreen.entity;

import lombok.Data;

import java.util.List;

@Data
public class Datamonitor1Application {

    //牵头单位
    private String leadingUnit;

    //应用
    private String application;

    //服务方式
    private String serviceMode;

    //基础库
    private String basicLibrary;

    //服务内容
    private String serviceContent;

    //应用成效
    private String applicatEffect;

    //累计调用次数
    private String ljdycs;

    private List<DataUpdateCondition> dataUpdateCondition;

}
