package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/15 17:16
 * @Version 1.0
 */
public interface CompanyService {

    /**行业类别*/
    List category(CompanyCategory companyCategory);

    /**企业类型*/
    List companyType(CompanyType companyType);

    /**企业数量趋势*/
    List companyNumber(Company company);

    /**按街道划分的企业数量*/
    List companyArea(ComGross comGross);

    /**时间轴*/
    List<Company> time();

    /**企业数量*/
    List company(ComGross company);

    List<CompanyDetail> detail(CompanyDetail companyDetail);

    List<Area> comArea(Area area);

}
