package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="关系标签")
public class DataservRelationLabel {

    private String idcard;
    private String idcard15;
    //户号
    private String rprno;
    private String presentAddress;

    //现住址小区
    private String presentVillage;
    private String companyname;
   //同一户号人数
    private Integer cntRprno;
    //同一住址人数
    private Integer cntPresentAddress;
    //同一小区人数
    private Integer cntPresentVillage;
    //同一公司人数
    private Integer cntCompanyname;









}
