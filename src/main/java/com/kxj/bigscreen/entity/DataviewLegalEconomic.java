package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewLegalEconomic {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;


    private String economicCode;

    //正常企业
    private Integer dataCount;


}
