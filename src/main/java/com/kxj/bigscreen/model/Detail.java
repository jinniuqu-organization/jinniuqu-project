package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 14:20
 * @Version 1.0
 */
@Data
public class Detail implements Serializable {

    private Integer id;
    private String dataSource;
    private String tableName;
    private String tableCname;
    private Integer dataAmount;
    private String tableSize;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;
}
