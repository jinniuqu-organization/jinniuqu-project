package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.model.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface ServerDao {

    List<CollectCondition> findDe();
    List<CollectCondition> findData(CollectCondition collectCondition);
    //List<DataUpdateCondition> findLine(@Param("dataList") List<Integer> departmentIds);
    List<CharMap> findLine();
    DataCollect findAmount();


}
