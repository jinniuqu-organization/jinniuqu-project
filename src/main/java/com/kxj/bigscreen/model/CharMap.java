package com.kxj.bigscreen.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/20 12:08
 * @Version 1.0
 */
@Data
public class CharMap {
    private Integer departmentId;
    private String department;
    private List<Chart> chart;
}
