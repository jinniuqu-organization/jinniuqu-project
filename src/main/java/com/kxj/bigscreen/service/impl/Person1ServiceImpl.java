package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.Person1Dao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.service.Person1Service;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.cfg.defs.EANDef;
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
public class Person1ServiceImpl implements Person1Service
{


    @Resource
    private Person1Dao person1Dao;

    @Override
    public PersonStatistics statistics(PersonStatistics personStatistics) {
        PersonStatistics statistics = person1Dao.statistics(personStatistics);

        log.info("##############"+statistics);
        return statistics;
    }

    @Override
    public List<PersonStatistics> time() {
        List<PersonStatistics> list = person1Dao.time();
        return list;
    }

    @Override
    public Sex sex(Sex sex) {
        Sex list = person1Dao.sex(sex);
        list.setManHold(list.getManHold()+"%");
        list.setWomanHold(list.getWomanHold()+"%");
        return list;


    }

    @Override
    public Marriage marriage(Marriage marriage) {
        Marriage list = person1Dao.marriage(marriage);
        list.setMarriedHold(list.getMarriedHold()+"%");
        list.setUnmarriedHold(list.getUnmarriedHold()+"%");
        return list;
    }

    @Override
    public PersonLabel personLabel(PersonLabel personLabel) {
        PersonLabel list = person1Dao.personLabel(personLabel);
        list.setDisabilityHold(list.getDisabilityHold()+"%");
        list.setPartyMemberHold(list.getPartyMemberHold()+"%");
        return list;
    }

    @Override
    public List education(Education education) {
        List<Education> list = person1Dao.education(education);
        log.info("###################"+list);
        HashMap data = person1Dao.educationGross(education);

       List list1 = new ArrayList();
       list1.add(list);
       list1.add(data);


        return list1;
    }

    @Override
    public List<AgeDistribute> ageDistribute(AgeDistribute ageDistribute) {
        List<AgeDistribute> list = person1Dao.ageDistribute(ageDistribute);
        return list;
    }

    @Override
    public List<AgeDistribute> area(AgeDistribute ageDistribute) {
        List<AgeDistribute> data = person1Dao.area(ageDistribute);
        return data;
    }

    @Override
    public List<PersonDetail> detail(PersonDetail personDetail) {
        List<PersonDetail> list = person1Dao.detail(personDetail);
        return list;
    }

    @Override
    public List<Area> personArea(Area area) {
        List<Area> data = person1Dao.person(area);
        return data;
    }
}
