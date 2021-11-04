package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CompanyDao;
import com.kxj.bigscreen.dao.CompanyNewDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.service.CompanyNewService;
import com.kxj.bigscreen.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class CompanyNewServiceImpl implements CompanyNewService {


    @Resource
    private CompanyNewDao companyNewDao;


    @Override
    public DataviewLegalState state(DataviewLegalState state) {
        DataviewLegalState list = companyNewDao.state(state);
        return list;
    }

    @Override
    public List<DataviewLegalState> time() {
        List<DataviewLegalState> list = companyNewDao.time();
        return list;
    }

    @Override
    public List<DataviewLegalState> comArea(DataviewLegalState area) {
        List<DataviewLegalState> list = companyNewDao.comArea(area);
        return list;
    }

    @Override
    public List<DataviewLegalIndustry> industry(DataviewLegalIndustry dataviewLegalIndustry) {
        List<DataviewLegalIndustry> list = companyNewDao.industry(dataviewLegalIndustry);
        return list;
    }

    @Override
    public List<DataviewLegalEconomic> economic(DataviewLegalEconomic dataviewLegalEconomic) {
        List<DataviewLegalEconomic> list = companyNewDao.economic(dataviewLegalEconomic);
        return list;
    }

    @Override
    public List<Unusual> unusual(Unusual data) {
        List<Unusual> list = companyNewDao.unusual(data);
        return list;
    }


}
