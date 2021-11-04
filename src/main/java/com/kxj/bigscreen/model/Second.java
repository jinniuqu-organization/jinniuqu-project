package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class Second {

    private String titleName;

    //为空或者null 不显示
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Thirt> children;
    private Integer level;
}
