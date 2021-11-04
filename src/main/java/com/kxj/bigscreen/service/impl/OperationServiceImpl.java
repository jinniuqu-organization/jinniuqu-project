package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.OperationDao;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:44
 * @Version 1.0
 */
@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    @Resource
    private OperationDao operationDao;

    @Override
    public HashMap findStandard() {
        List<StandardMonitor> clean = operationDao.findClean();
        List<StandardMonitor> optim = operationDao.findOptimization();
        List<StandardMonitor> standard = operationDao.findStandard();
        List<StandardMonitor> fuse = operationDao.findFuse();
        Integer data = operationDao.dataAmount();
        LinkedHashMap map = new LinkedHashMap();
        map.put("clean",clean);
        map.put("optimization",optim);
        map.put("standard",standard);
        map.put("fuse",fuse);

        map.put("dataAmount",data);
        return map;
    }

    @Override
    public List<DataGovernBasis> findBasis() {
        List<DataGovernBasis> list = operationDao.findBasis();
        return list;
    }

    @Override
    public List<DataGovernBasis> findBasisPdf(DataGovernBasis dataGovernBasis) {

        List<DataGovernBasis> list = operationDao.findBasisPdf(dataGovernBasis);
        return list;
    }

    @Override
    public List<DataGovernServer> findServer() {
        List<DataGovernServer> list = operationDao.findServer();
        return list;
    }

    @Override
    public List<CodeServer> findCodeServer() {
        List<CodeServer> original = operationDao.findOriginal();
        List<CodeServer> standard = operationDao.findStandards();
        List<CodeMap> codeMap = operationDao.findCodeMap();
        LinkedHashMap map = new LinkedHashMap();
        map.put("original",original);
        map.put("standard", standard);
        map.put("codeMap" ,codeMap );
        List list = new ArrayList();
        list.add(map);
        return list;
    }

    @Override
    public List<StandardTop> findStandardTop() {
        List<StandardTop> list = operationDao.findStandardTop();
        return list;
    }

    @Override
    public List<CodeTop> findCodeTop() {
        List<CodeTop> list = operationDao.findCodeTop();
        return list;
    }

    @Override
    public List<CodeStandard> findWord() {
        List<CodeStandard> list = operationDao.findWord();
        return list;
    }

}
