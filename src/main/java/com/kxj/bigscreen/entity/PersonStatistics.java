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
@ApiModel(value="PersonStatistics对象", description="人口统计")
public class PersonStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "人口总量")
    private Long gross;

    @ApiModelProperty(value = "实有人口")
    private Integer inEffect;

    @ApiModelProperty(value = "流动人口")
    private Integer stream;

    @ApiModelProperty(value = "户籍人口")
    private Integer census;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String updateTime;


}
