package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.Person1Dao;
import com.kxj.bigscreen.dao.PersonNewDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.service.Person1Service;
import com.kxj.bigscreen.service.PersonNewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/14 10:01
 * @Version 1.0
 */
@Slf4j
@Service
public class PersonNewServiceImpl implements PersonNewService {


    @Resource
    private PersonNewDao personNewDao;

    @Override
    public DataviewPerArea statistics(DataviewPerArea personStatistics) {
        DataviewPerArea statistics = personNewDao.statistics(personStatistics);

        return statistics;
    }

    @Override
    public List<DataviewPerArea> time() {
        List<DataviewPerArea> list = personNewDao.time();
        return list;
    }

    @Override
    public List<DataviewPerAge> sex(DataviewPerAge sex) {
        List<DataviewPerAge> man = personNewDao.man(sex);

        List<DataviewPerAge> woman = personNewDao.woman(sex);

        List list = new ArrayList();
        list.addAll(woman);
        list.addAll(man);
        return list;
    }

    @Override
    public List<DataviewPerFloat> perFloat(DataviewPerFloat perFloat) {
        List<DataviewPerFloat> list = personNewDao.perFloat(perFloat);
        return list;
    }

    @Override
    public List<DataviewPerJf> jf(DataviewPerJf jf) {
        List<DataviewPerJf> list = personNewDao.jf(jf);
        return list;
    }

    @Override
    public List<DataviewPerYm> ym(DataviewPerYm ym) {
        List<DataviewPerYm> list = personNewDao.ym(ym);
        return list;
    }


    @Override
    public List<DataviewPerArea> personArea(DataviewPerArea area) {
        List<DataviewPerArea> data = personNewDao.person(area);
        return data;
    }
}
