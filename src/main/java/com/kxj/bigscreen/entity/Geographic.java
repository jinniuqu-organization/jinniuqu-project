package com.kxj.bigscreen.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Acthor Tao.Lee @date 2021/10/18 14:31
 * @Description
 */
@Data
public class Geographic {
    //地理信息表名汇总
    private Integer id;

    private String table;

    private String tableName;

    private String parm;

    private Date createTime;

}
