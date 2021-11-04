package com.kxj.bigscreen.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="关系链")
public class DataservRelationChain {

    //月数
    private String monthId;
    private String idcard;
    private String idcard15;

    //技防开门总次数
    private Integer cntTotal;
    //技防开门成功次数
    private Integer cntSuccess;


}
