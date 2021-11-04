package com.kxj.bigscreen.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Acthor Tao.Lee @date 2021/10/25 10:18
 * @Description  地理信息汇总表实体类
 */
@Data
public class GeographicSummary {

    private Integer id;

    private String subName;

    private String name;

    private String code;

    private String address;

    private String affiliation;
//经度
    private String xCoordinate;
//维度
    private String yCoordinate;

    private String more;

    private Integer searchId;

    private Date createTime;

}
