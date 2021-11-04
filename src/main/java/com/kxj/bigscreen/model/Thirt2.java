package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Thirt2 {
    private String firstTitle;
    private String secondTitle;
    private Integer id;
    private String titleName;
    private String standardUrl;
    private String status;
    private String code;
    private Integer version;


    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateTime;
}
