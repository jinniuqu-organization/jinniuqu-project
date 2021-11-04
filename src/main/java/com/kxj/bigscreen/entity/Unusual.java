package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;

@Data
public class Unusual {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    //年龄范围
    private String year;
    private String companyOwnTax;

    private String companyIllegalInfo;

    private String companyAbnormalInfo;

}
