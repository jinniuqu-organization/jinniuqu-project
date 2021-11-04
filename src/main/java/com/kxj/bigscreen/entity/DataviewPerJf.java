package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewPerJf {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    //流动原因
    private String areaName;

    private String zcRatio;


}
