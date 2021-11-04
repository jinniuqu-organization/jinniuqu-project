package com.kxj.bigscreen.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="现住址")
public class DataservPersonJzdz {

    private String idcard;
    private String idcard15;
    //  户籍地址省份
    private String presentProvince;
    //户籍地址  市
    private String presentCity;
    //户籍地址区
    private String presentDistrict;
    //户籍地址 街道
    private String presentStreet;
    //详细户籍地址
    private String presentAddress;

    //纬度
    private String lat;
    //经度
    private String lng;





}
