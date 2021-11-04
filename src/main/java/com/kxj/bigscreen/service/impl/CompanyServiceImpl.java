package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CompanyDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/15 17:17
 * @Version 1.0
 */
@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService {


    @Resource
    private CompanyDao companyDao;


    @Override
    public List category(CompanyCategory companyCategory) {
        List<CompanyCategory> list = companyDao.category(companyCategory);
        HashMap cateGross = companyDao.cateGross(companyCategory);
        List list1 = new ArrayList();
        list1.add(list);
        list1.add(cateGross);
        return list1;
    }

    @Override
    public List companyType(CompanyType companyType) {
        List<CompanyType> list = companyDao.companyType(companyType);
        HashMap companyGross = companyDao.companyGross(companyType);
        List list1 = new ArrayList();
        list1.add(list);
        list1.add(companyGross);
        return list1;
    }

    @Override
    public List companyNumber(Company company) {
        List<Company> list=companyDao.register(company);
        return list;

    }

    @Override
    public List companyArea(ComGross comGross) {

        List<ComGross> list = companyDao.area(comGross);

        return list;
    }

    @Override
    public List<Company> time() {
        List<Company> data = companyDao.time();
        return data;
    }

    @Override
    public List company(ComGross company) {

        List<ComGross> com = companyDao.company(company);


        return com;
    }

    @Override
    public List<CompanyDetail> detail(CompanyDetail companyDetail) {
        List<CompanyDetail> list = companyDao.detail(companyDetail);
        return list;
    }

    @Override
    public List<Area> comArea(Area area) {
        List<Area> data = companyDao.comArea(area);
        return data;
    }
}
