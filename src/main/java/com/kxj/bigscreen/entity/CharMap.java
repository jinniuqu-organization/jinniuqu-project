package com.kxj.bigscreen.entity;

import com.kxj.bigscreen.entity.Chart;
import lombok.Data;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/20 12:08
 * @Version 1.0
 */
@Data
public class CharMap {
    private Integer tableId;
    private String tableNote;
    private List<Chart> chart;
}
