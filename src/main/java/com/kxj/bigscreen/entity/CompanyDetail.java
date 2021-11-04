package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/19 15:54
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="企业详情", description="企业详情")
public class CompanyDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "企业总量")
    private Integer gross;

    @ApiModelProperty(value = "存续")
    private Integer cx;

    @ApiModelProperty(value = "注吊销")
    private Integer zdx;

    @ApiModelProperty(value = "迁出")
    private Integer qc;

    @ApiModelProperty(value = "卫生和社会工作")
    private Integer health;

    @ApiModelProperty(value = "教育")
    private Integer education;

    @ApiModelProperty(value = "金融")
    private Integer financial;

    @ApiModelProperty(value = "制造业")
    private Integer make;

    @ApiModelProperty(value = "批发和零售业")
    private Integer retail;

    @ApiModelProperty(value = "住宿和餐饮业")
    private Integer hotel;

    @ApiModelProperty(value = "中外合资")
    private Integer chinaForeign;

    @ApiModelProperty(value = "股份有限公司")
    private Integer stockLimited;

    @ApiModelProperty(value = "有限责任公司")
    private Integer dutyLimited;

    @ApiModelProperty(value = "国有全资")
    private Integer stateOwned;

    @ApiModelProperty(value = "集体全资")
    private Integer collective;

    @ApiModelProperty(value = "联营")
    private Integer consortia;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;



}
