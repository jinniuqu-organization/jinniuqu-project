package com.kxj.bigscreen.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="户籍地址")
public class DataservPersonHjdz {

    private String idcard;
    private String idcard15;
    //  户籍地址省份
    private String rprProvince;
    //户籍地址  市
    private String rprCity;
    //户籍地址区
    private String rprDistrict;
    //户籍地址 街道
    private String rprStreet;
    //详细户籍地址
    private String rprAddress;

    //纬度
    private String lat;
    //经度
    private String lng;





}
