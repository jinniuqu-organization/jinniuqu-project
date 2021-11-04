package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:31
 * @Version 1.0
 */
@Data
public class DataGovernBasis implements Serializable {

    private Integer id;
    private String type;
    private String url;
    private Integer amount;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;
}
