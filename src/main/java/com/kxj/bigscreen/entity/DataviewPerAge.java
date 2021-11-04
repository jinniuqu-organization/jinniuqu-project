package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;

@Data
public class DataviewPerAge {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;

    private String name;

    private List<DataviewPerAgeData> dataviewPerAgeData;
}
