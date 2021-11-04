package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.Time;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/14 9:59
 * @Version 1.0
 */
public interface PersonNewDao {

    /**查询人口总量*/
    DataviewPerArea statistics(DataviewPerArea personStatistics);

    /**人口总量时间*/
    List<DataviewPerArea> time();

    /**男女占比*/
    List<DataviewPerAge> man(DataviewPerAge sex);

    List<DataviewPerAge> woman(DataviewPerAge sex);

    /**流动人口情况*/
    List<DataviewPerFloat> perFloat(DataviewPerFloat perFloat);

    /**注册技防占比*/
    List<DataviewPerJf> jf(DataviewPerJf jf);

    /**各街道疫苗接种比率*/
    List<DataviewPerYm> ym(DataviewPerYm ym);

    /**根据街道查询人口总量*/
    List<DataviewPerArea> person(DataviewPerArea dataviewPerArea);



}
