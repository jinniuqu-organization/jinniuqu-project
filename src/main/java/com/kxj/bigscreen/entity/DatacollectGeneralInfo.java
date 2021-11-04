package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class DatacollectGeneralInfo {

    private Integer id;

    //数据时间
    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private String DateId;

    //信息资源分类
    private String tableType;

    //所属部门
    private String departName;

    //信息资源
    private String tableNote;

    //信息资源名称
    private Integer tableId;

    //更新周期
    private String updateCycle;

    //数据范围
    private String dataRange;

    //数据量
    private String dataCount;
}
