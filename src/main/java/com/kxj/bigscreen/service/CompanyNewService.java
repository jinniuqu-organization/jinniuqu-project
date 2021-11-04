package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/15 17:16
 * @Version 1.0
 */
public interface CompanyNewService {

    //企业情况
    DataviewLegalState state(DataviewLegalState state);

    /**时间轴*/
    List<DataviewLegalState> time();


    List<DataviewLegalState> comArea(DataviewLegalState area);

    //行业类别
    List<DataviewLegalIndustry> industry(DataviewLegalIndustry dataviewLegalIndustry);

    //经济类型
    List<DataviewLegalEconomic> economic (DataviewLegalEconomic dataviewLegalEconomic);

    List<Unusual> unusual (Unusual data);
}
