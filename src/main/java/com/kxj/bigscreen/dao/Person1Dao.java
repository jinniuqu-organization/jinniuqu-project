package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/14 9:59
 * @Version 1.0
 */
public interface Person1Dao {

    /**查询人口总量*/
    PersonStatistics statistics(PersonStatistics personStatistics);

    /**人口总量时间*/
    List<PersonStatistics> time();

    /**男女占比*/
    Sex sex(Sex sex);

    /**婚姻情况占比*/
    Marriage marriage(Marriage marriage);

    /**残疾和党员占比*/
    PersonLabel personLabel(PersonLabel personLabel);

    /**学历情况查询*/
    List<Education> education(Education education);
    HashMap educationGross(Education education);

    /**年龄分布*/
    List<AgeDistribute> ageDistribute(AgeDistribute ageDistribute);

    /**各街道男女情况*/
    List<AgeDistribute> area(AgeDistribute ageDistribute);

    /**人口详情*/
    List<PersonDetail> detail(PersonDetail personDetail);

    /**根据街道查询人口总量*/
    List<Area> person(Area area);





}
