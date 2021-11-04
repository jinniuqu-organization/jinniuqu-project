package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 14:16
 * @Version 1.0
 */
@Data
public class QualityReport implements Serializable {

    private Integer id;
    private String serverDepartment;
    private String reportName;
    private String itemName;
    private String contractor;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone="GMT+8")
    private String createTime;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone="GMT+8")
    private String updateTime;
}
