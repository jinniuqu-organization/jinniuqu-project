package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CollectNewDao;
import com.kxj.bigscreen.dao.OperationDao;
import com.kxj.bigscreen.dao.OperationNewDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.OperationNewService;
import com.kxj.bigscreen.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:44
 * @Version 1.0
 */
@Service
@Slf4j
public class OperationNewServiceImpl implements OperationNewService {

    @Resource
    private OperationNewDao operationNewDao;

    @Resource
    private CollectNewDao collectNewDao;

    @Override
    public HashMap findStandard() {
        List<StandardMonitor> clean = operationNewDao.findClean();
        List<StandardMonitor> optim = operationNewDao.findOptimization();
        List<StandardMonitor> standard = operationNewDao.findStandard();
        List<StandardMonitor> fuse = operationNewDao.findFuse();
        LinkedHashMap map = new LinkedHashMap();
        map.put("clean",clean);
        map.put("optimization",optim);
        map.put("standard",standard);
        map.put("fuse",fuse);

        DatacollectGeneralService data1 = collectNewDao.findAmount();
        map.put("dataAmount",data1.getDataCount());

        return map;
    }

    @Override
    public List<Datamonitor1Application> application() {
        List<Datamonitor1Application> list = operationNewDao.application();
        return list;
    }

    @Override
    public List<Datamonitor2Tansform> transform() {
        List<Datamonitor2Tansform> list = operationNewDao.transform();
        return list;
    }

    @Override
    public List<TransformManage> manage(Datamonitor2Tansform datamonitor2Tansform) {
        List<TransformManage> list = operationNewDao.manage(datamonitor2Tansform);
        return list;
    }

    @Override
    public List<Datamonitor2StandardService> service() {
        List<Datamonitor2StandardService> list = operationNewDao.service();
        return list;
    }


}
