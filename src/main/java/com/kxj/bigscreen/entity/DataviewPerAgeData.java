package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewPerAgeData {

    //年龄范围
    private String ageRange;

    private Integer dataCount;


}
