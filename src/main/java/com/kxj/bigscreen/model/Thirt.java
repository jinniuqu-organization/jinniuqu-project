package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Thirt {
    private String firstTitle;
    private String secondTitle;
    private Integer id;
    private String titleName;
    private String standardUrl;
    private String status;
    private String code;
    private String version;
    private Integer level ;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;
}
