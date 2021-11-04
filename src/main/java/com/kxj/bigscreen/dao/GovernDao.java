package com.kxj.bigscreen.dao;


import com.kxj.bigscreen.entity.Department;
import com.kxj.bigscreen.model.CharMap;
import com.kxj.bigscreen.model.CollectCondition;
import com.kxj.bigscreen.model.DataCollect;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface GovernDao {

    List<Department> tableName();
    List<CollectCondition> getInfo(CollectCondition collectCondition);
    List<CharMap> findLine();
    DataCollect findAmount();



}
