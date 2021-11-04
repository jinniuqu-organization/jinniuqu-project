package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewPerYm {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    //
    private String areaName;

    private Integer yyjzCnt;


    private Integer wyjzCnt;
}
