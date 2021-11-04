package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DatacollectUpdate {

    private Integer id;

    @JsonFormat(pattern = "yyyy/MM",timezone="GMT+8")
    private String dateId;


    //标注释
    private String tableNote;

    //表名
    private Integer tableId;

    //数据量
    private Integer dataTotal;

    //数据量
    private Integer dataUpdate;

}
