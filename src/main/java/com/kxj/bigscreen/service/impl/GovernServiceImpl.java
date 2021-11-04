package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CollectNewDao;
import com.kxj.bigscreen.dao.GovernDao;

import com.kxj.bigscreen.entity.Department;
import com.kxj.bigscreen.model.CharMap;
import com.kxj.bigscreen.model.CollectCondition;
import com.kxj.bigscreen.model.DataCollect;
import com.kxj.bigscreen.service.CollectNewService;
import com.kxj.bigscreen.service.GovernService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static java.lang.Math.round;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:39
 * @Version 1.0
 */
@Service
@Slf4j
public class GovernServiceImpl implements GovernService {


    @Resource
    private GovernDao governDao;


    @Override
    public List<Department> tableName() {
        List<Department> list = governDao.tableName();
        return list;
    }

    @Override
    public List<CollectCondition> getInfo(CollectCondition collectCondition) {
        List<CollectCondition> list = governDao.getInfo(collectCondition);
        return list;
    }


    @Override
    public List<CharMap> findLine() {

        List <CharMap> list = governDao.findLine();

        return list;
    }




    @Override
    public DataCollect findAmount() {
        DataCollect list = governDao.findAmount();

        return list;
    }



}
