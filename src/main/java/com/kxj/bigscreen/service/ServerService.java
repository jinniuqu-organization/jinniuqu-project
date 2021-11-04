package com.kxj.bigscreen.service;

import com.kxj.bigscreen.model.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:38
 * @Version 1.0
 */
public interface ServerService {

    List<CollectCondition> findDe();
    List<CollectCondition> findData(CollectCondition collectCondition) throws ParseException;
    //List<DataUpdateCondition> findLine(Integer departmentId);
    List<CharMap> findLine();

    DataCollect findAmount();


}
