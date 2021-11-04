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
@ApiModel(value="AgeDistribute对象", description="年龄情况")
public class AgeDistribute implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "区域")
    private String areaName;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "男")
    private Integer man;

    @ApiModelProperty(value = "女")
    private Integer woman;

    @ApiModelProperty(value = "总数")
    private Integer gross;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;


}
