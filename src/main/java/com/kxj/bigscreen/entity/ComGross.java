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
 * @Date: 2020/5/22 10:43
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Company对象", description="企业情况")
public class ComGross implements Serializable {

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

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String updateTime;
}
