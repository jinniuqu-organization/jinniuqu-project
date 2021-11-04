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
@ApiModel(value="PersonLabel对象", description="人口标签")
public class PersonLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域id")
    private Long areaId;

    @ApiModelProperty(value = "人口总量")
    private Integer gross;

    @ApiModelProperty(value = "残疾")
    private Integer disability;

    @ApiModelProperty(value = "残疾占比")
    private String disabilityHold;

    @ApiModelProperty(value = "党员")
    private Integer partyMember;

    @ApiModelProperty(value = "党员占比")
    private String partyMemberHold;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;


}
