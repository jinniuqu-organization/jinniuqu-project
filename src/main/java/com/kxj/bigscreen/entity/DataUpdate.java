package com.kxj.bigscreen.entity;

import com.kxj.bigscreen.entity.DataUpdateCondition;
import lombok.Data;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/8 12:08
 * @Version 1.0
 */
@Data
public class DataUpdate {
    private String tableNote;
    private Integer tableId;
    private List<DataUpdateCondition> dataUpdateCondition;
}
