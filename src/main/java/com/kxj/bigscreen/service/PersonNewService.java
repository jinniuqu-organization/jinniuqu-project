package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/14 10:00
 * @Version 1.0
 */

public interface PersonNewService {

    DataviewPerArea statistics(DataviewPerArea dataviewPerArea);

    /**人口总量时间查询*/
    List<DataviewPerArea> time();

    /**男女占比*/
    List<DataviewPerAge> sex(DataviewPerAge sex);

    /**流动人口情况*/
    List<DataviewPerFloat> perFloat(DataviewPerFloat perFloat);

    /**注册技防占比*/
    List<DataviewPerJf> jf(DataviewPerJf jf);

    /**各街道疫苗接种比率*/
    List<DataviewPerYm> ym(DataviewPerYm ym);


    List<DataviewPerArea> personArea(DataviewPerArea area);


}
