package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class Datamonitor1Standard {


    private Integer dataCount;
    //脏数据
    private Integer  dirtyData;

    //重复数据
    private Integer duplicateData;

    //数据回填
    private Integer backfillData;

    //问题修正
    private Integer reviseData;

    //单位统一
    private Integer unitUnify;

    //编码统一
    private Integer codeUnify;

    //多表合一前
    private Integer integrateBefore;

    //多表合一后
    private Integer integrateAfter;


}
