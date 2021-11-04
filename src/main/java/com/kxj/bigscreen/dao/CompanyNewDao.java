package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.Time;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/15 17:14
 * @Version 1.0
 */
public interface CompanyNewDao {

    //企业情况
    DataviewLegalState state(DataviewLegalState state);

    /**时间轴*/
    List<DataviewLegalState> time();

    /**街道公司信息*/
    List<DataviewLegalState> comArea(DataviewLegalState area);

    //行业类别
    List<DataviewLegalIndustry> industry(DataviewLegalIndustry dataviewLegalIndustry);

    //经济类型
    List<DataviewLegalEconomic> economic (DataviewLegalEconomic dataviewLegalEconomic);

    //企业异常趋势
    List<Unusual> unusual (Unusual data);

}
