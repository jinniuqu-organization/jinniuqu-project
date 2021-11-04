package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CollectDao;
import com.kxj.bigscreen.dao.OperationDao;
import com.kxj.bigscreen.dao.QualityDao;
import com.kxj.bigscreen.dao.ServerDao;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectService;
import com.kxj.bigscreen.service.ServerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:39
 * @Version 1.0
 */
@Service
@Slf4j
public class ServerServiceImpl implements ServerService {


    @Resource
    private ServerDao serverDao;


    @Override
    public List<CollectCondition> findDe() {
        List<CollectCondition> list = serverDao.findDe();
        return list;
    }

    @Override

    public List<CollectCondition> findData(CollectCondition collectCondition) {
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<CollectCondition> list = serverDao.findData(collectCondition);
        return list;
    }

    @Override
    public List<CharMap> findLine() {

        List <CharMap> list = serverDao.findLine();
        return list;
    }




    @Override
    public DataCollect findAmount() {
        DataCollect list = serverDao.findAmount();

        return list;
    }






}
