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
@ApiModel(value="Sex对象", description="性别情况")
public class Sex implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "区域")
    private String area;

    @ApiModelProperty(value = "男")
    private Integer man;

    @ApiModelProperty(value = "男生占比")
    private String manHold;

    @ApiModelProperty(value = "女")
    private Integer woman;

    @ApiModelProperty(value = "女生占比")
    private String womanHold;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;


}
