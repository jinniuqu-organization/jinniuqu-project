package com.kxj.bigscreen.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="个性化新闻推荐")
public class DataservNewsRecommend {

    private String idcard;
    private String idcard15;

    private String title;

    private String contents;

    private String pic;
}
