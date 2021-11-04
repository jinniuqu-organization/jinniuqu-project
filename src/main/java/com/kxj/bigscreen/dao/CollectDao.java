package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface CollectDao {

    List<CollectCondition> findDe();
    List<CollectCondition> findData(CollectCondition collectCondition);
    //List<DataUpdateCondition> findLine(@Param("dataList") List<Integer> departmentIds);
    List<CharMap> findLine();
    List<DataUpdateCondition> findUpdate(DataUpdateCondition dataUpdateCondition);
    DataCollect findAmount();
    List<Document> findDocument();

    Time time(Integer screenId);
    List<Index> findIndex(Integer screenId);
}
