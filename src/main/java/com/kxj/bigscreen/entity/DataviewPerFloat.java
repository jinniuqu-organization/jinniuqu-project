package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewPerFloat {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    //流动原因
    private String floatReson;

    private Integer floatCnt;


}
