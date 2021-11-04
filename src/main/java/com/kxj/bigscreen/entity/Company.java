package com.kxj.bigscreen.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2020-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Company对象", description="企业情况")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "存续")
    private Integer cx;

    @ApiModelProperty(value = "注吊销")
    private Integer zdx;

    @ApiModelProperty(value = "迁出")
    private Integer qc;

    @ApiModelProperty(value = "注册时间")
    private String registTime;


    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String updateTime;


}
