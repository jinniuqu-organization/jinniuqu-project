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
 * @Date: 2020/5/19 10:17
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="人口详情", description="人口详情")
public class PersonDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "人口总量")
    private Integer gross;

    @ApiModelProperty(value = "男")
    private Integer man;

    @ApiModelProperty(value = "女")
    private Integer woman;

    @ApiModelProperty(value = "已婚")
    private Integer married;

    @ApiModelProperty(value = "未婚")
    private Integer unmarried;

    @ApiModelProperty(value = "十八岁以下")
    private Integer child;

    @ApiModelProperty(value = "18-30")
    private Integer eighteen;

    @ApiModelProperty(value = "31-40")
    private Integer thirty;

    @ApiModelProperty(value = "41-50")
    private Integer forty;

    @ApiModelProperty(value = "51-60")
    private Integer fifty;

    @ApiModelProperty(value = "60岁以上")
    private Integer sixty;

    @ApiModelProperty(value = "高中以下")
    private Integer junior;

    @ApiModelProperty(value = "高中")
    private Integer high;

    @ApiModelProperty(value = "本科")
    private Integer undergraduate;

    @ApiModelProperty(value = "硕博士")
    private Integer masterDoctor;

    @ApiModelProperty(value = "残疾人")
    private Integer disability;

    @ApiModelProperty(value = "党员")
    private Integer partyMember;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;




}
