package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class Datamonitor2Tansform {

    private String departName;

    private String tableNote;

    private String tableName;

    //总条数
    private Integer totalcodeCnt;

    //归为成功条数
    private Integer rightcodeCnt;

    //归为其他条数
    private Integer othercodeCnt;

}
