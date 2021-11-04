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
public interface CompanyDao {

    /**行业类别*/
    List<CompanyCategory> category(CompanyCategory companyCategory);

    HashMap cateGross(CompanyCategory companyCategory);

    /**企业类型*/
    List<CompanyType> companyType(CompanyType companyType);

    HashMap companyGross(CompanyType companyType);

    /**注册时间*/
    List<Company> register(Company company);



    List<ComGross> area(ComGross comGross);

    /**时间轴*/
    List<Company> time();

    /**企业数量*/
    List<ComGross> company(ComGross comGross);


    List<CompanyDetail> detail(CompanyDetail companyDetail);

    List<Area> comArea(Area area);


}
