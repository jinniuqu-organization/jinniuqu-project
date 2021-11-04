package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/14 10:00
 * @Version 1.0
 */

public interface Person1Service {

    PersonStatistics statistics(PersonStatistics personStatistics);

    /**人口总量时间查询*/
    List<PersonStatistics> time();

    /**男女占比*/
    Sex sex(Sex sex);

    /**婚姻情况占比*/
    Marriage marriage(Marriage marriage);

    /**残疾和党员占比*/
    PersonLabel personLabel(PersonLabel personLabel);

    /**学历情况查询*/
    List education(Education education);

    /**年龄分布*/
    List<AgeDistribute> ageDistribute(AgeDistribute ageDistribute);

    /**各街道男女情况*/
    List<AgeDistribute> area(AgeDistribute ageDistribute);

    /**人口详情*/
    List<PersonDetail> detail(PersonDetail personDetail);

    List<Area> personArea(Area area);


}
