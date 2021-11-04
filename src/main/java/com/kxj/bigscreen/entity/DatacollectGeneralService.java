package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class DatacollectGeneralService {

    private Integer id;

    private String dateId;

    //所属部门
    private String departName;

    //数据表
    private Integer tableAmount;

    //数据项
    private Integer itemAmount;


    //数据量
    private Integer dataCount;

    //
    private Integer linkAmount;
}
