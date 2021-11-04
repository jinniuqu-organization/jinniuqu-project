package com.kxj.bigscreen.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="工作地址")
public class DataservPersonGzdz extends LatLng{

    private String idcard;
    private String idcard15;
    //  工作单位
    private String entName;
    //工作地址
    private String regAddress;
    //组织机构代码
    private String regId;
    //经营状态
    private String entState;
    //行业
    private String industryCode;
    //公司规模
    private String staffNumber;






}
