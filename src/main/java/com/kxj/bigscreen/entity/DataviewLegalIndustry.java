package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewLegalIndustry {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;


    private String industryCode;

    //正常企业
    private Integer dataCount;


}
