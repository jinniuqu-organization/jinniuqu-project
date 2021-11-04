package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.CollectDao;
import com.kxj.bigscreen.dao.CollectNewDao;
import com.kxj.bigscreen.dao.OperationDao;
import com.kxj.bigscreen.dao.QualityDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.entity.CharMap;
import com.kxj.bigscreen.entity.DataUpdateCondition;
import com.kxj.bigscreen.entity.Document;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectNewService;
import com.kxj.bigscreen.service.CollectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.round;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:39
 * @Version 1.0
 */
@Service
@Slf4j
public class CollectNewServiceImpl implements CollectNewService {


    @Resource
    private CollectNewDao collectNewDao;


    @Override
    public List<TableInfo> tableName() {
        List<TableInfo> list = collectNewDao.tableName();
        return list;
    }

    @Override
    public List<DatacollectGeneralInfo> getInfo() {
        List<DatacollectGeneralInfo> list = collectNewDao.getInfo();
        return list;
    }


    @Override
    public List<CharMap> findLine() {

        List <CharMap> list = collectNewDao.findLine();
        return list;
    }


    @Override
    public List<DataUpdateCondition> findUpdate(DatacollectUpdate dataUpdateCondition) {
        List<DataUpdateCondition> list = collectNewDao.findUpdate(dataUpdateCondition);

        return list;
    }

    @Override
    public DatacollectGeneralService findAmount() {
        DatacollectGeneralService list = collectNewDao.findAmount();

        list.setDataCount((int) round(list.getDataCount()/10000.00));
        return list;
    }

    @Override
    public List<Document> findDocumentInfo(Document document) {
        List<Document> list = collectNewDao.findDocumentInfo(document);
        return list;
    }

    @Override
    public List<DatacollectDocument> findDocument() {
        List<DatacollectDocument> list = collectNewDao.findDocument();
        return list;
    }


}
