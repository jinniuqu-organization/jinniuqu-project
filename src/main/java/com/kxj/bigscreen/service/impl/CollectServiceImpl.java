package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.*;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:39
 * @Version 1.0
 */
@Service
@Slf4j
public class CollectServiceImpl implements CollectService {

    public static final Integer MAX = 11;
    public static final Integer INDEX= 3;


    public static final Integer SCREEN_ID1 =1;
    public static final Integer SCREEN_ID2 =2;
    public static final Integer SCREEN_ID3 =3;
    public static final Integer SCREEN_ID4 =4;
    //标准管理01
    public static final Integer SCREEN_ID5 =5;
    //标准管理02
    public static final Integer SCREEN_ID6 =6;
    //组织架构
    public static final Integer SCREEN_ID7 =7;
    //主数据查询
    public static final Integer SCREEN_ID8 =8;
    //主数据 api
    public static final Integer SCREEN_ID9 =9;
    //首页 人口
    public static final Integer SCREEN_ID11 = 11;
    //首页 企业
    public static final Integer SCREEN_ID12 =12;
    //首页 画像
    public static final Integer SCREEN_ID13 =13;

    //BigDecimal wan = new BigDecimal(10000);
    @Resource
    private CollectDao collectDao;

    @Resource
    private CollectNewDao collectNewDao;

    @Resource
    private OperationNewDao operationNewDao;

    @Resource
    private QualityDao qualityDao;

    @Resource
    private ServerDao serverDao;

    @Resource
    private PersonNewDao personNewDao;

    @Resource
    private CompanyNewDao companyNewDao;

    @Override
    public List<CollectCondition> findDe() {
        List<CollectCondition> list = collectDao.findDe();
        return list;
    }

    @Override

    public List<CollectCondition> findData(CollectCondition collectCondition) {
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<CollectCondition> list = collectDao.findData(collectCondition);
        return list;
    }

    @Override
    public List<CharMap> findLine() {

        List <CharMap> list = collectDao.findLine();
        return list;
    }


    @Override
    public List<DataUpdateCondition> findUpdate(DataUpdateCondition dataUpdateCondition) {
        List<DataUpdateCondition> list = collectDao.findUpdate(dataUpdateCondition);

        return list;
    }

    @Override
    public DataCollect findAmount() {
        DataCollect list = collectDao.findAmount();

        return list;
    }

    @Override
    public List<Document> findDocument() {
        List<Document> list = collectDao.findDocument();
        return list;
    }

    @Override
    public HashMap timeAndIndex(Integer screenId) {

        HashMap map = new HashMap<>();
        if (screenId.equals(SCREEN_ID1)){
            //数据治理服务
            time(screenId, map);
        }else if(screenId.equals(SCREEN_ID2)){
            //数据汇集监控
            time(screenId, map);
        }else if(screenId.equals(SCREEN_ID3)){
            //数据运行监控01
            time(screenId, map);
        }else if(screenId.equals(SCREEN_ID4)){
            //运行监控02
            time(screenId, map);
        }else if(screenId.equals(SCREEN_ID11)){
            //人口
            time(screenId, map);
        }else if(screenId.equals(SCREEN_ID12)){
            //企业
            time(screenId, map);
        }
        else if(screenId.equals(SCREEN_ID13)){
            //画像
            time(screenId, map);
        }

        return map;
    }


    private void time(Integer screenId, HashMap map) {
        Time time = collectDao.time(screenId);
        List<Index> list = collectDao.findIndex(screenId);
        map.put("time", time);
        map.put("index", list);
    }


    private List<Integer> getData(Integer departmentId) {
        List<Integer> list = new ArrayList<>();
        int result;
        for (int x = 0; x < INDEX; x++) {
            result = departmentId + x;
            if (departmentId > MAX) {
                result -= MAX;
            }
            list.add(result);
            log.error("#########"+list);
        }
        return list;

    }



}
