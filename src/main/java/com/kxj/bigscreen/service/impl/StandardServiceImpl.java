package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.StandardDao;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.StandardService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:16
 * @Version 1.0
 */
@Service
@Slf4j
public class StandardServiceImpl implements StandardService {

    @Resource
    private StandardDao standardDao;

    @Override
    public List<Standard> findStandard() {
        List<Standard> list = standardDao.findStandard();
        return list;
    }

    @Override
    public List<SecondTitle> findTitle(Standard standard) {
        List<SecondTitle> list = standardDao.findTitle(standard);
        log.info("#########",list);
        return list;
    }

    @Override
    public Map<String , List<StandardMap>> findPdf(Standard standard) {
        List <StandardMap> list = standardDao.findPdf(standard);
        Integer total = standardDao.findTotal(standard);
        LinkedHashMap map = new LinkedHashMap();
        log.error("#######"+list);
        if(!CollectionUtils.isEmpty(list) && list.get(0)!=null) {
            map.put("standard", list);
        }
        if(total!=null && total !=0) {
            map.put("total", total);
        }
        return map;
    }

    @Override
    public HashMap findAmount() {
        List<StandardAmount> list = standardDao.findAmount();
        StandardAmount item = standardDao.findItem();
        LinkedHashMap map = new LinkedHashMap();
        map.put("items",list);
        map.put("amount",item);
        return map;
    }

    @Override
    public List<StandardMap> search(StandardMap standardMap) {
        List<StandardMap> list = standardDao.search(standardMap);

        return list;
    }

    @Override
    public List<FirstTitle> findAll() {
        List<FirstTitle> list = standardDao.findAll();
        for (FirstTitle data:list) {
            List<Second> list1 = data.getChildren();
            for (Second data1:list1) {
                List<Thirt> list2 = data1.getChildren();
                //迭代器删除标准为空的数据
                Iterator<Thirt> iterator = list2.iterator();
                while(iterator.hasNext()){
                    Thirt data2 = iterator.next();
                    if (data2.getTitleName()==null) {
                        iterator.remove();
                    }

                }
                for (Thirt data3:list2) {
                    String version = data3.getVersion();
                    data3.setVersion("v"+version+".0");
                }



            }

        }
        return list;
    }

    @Override
    public int delete(Integer id) {
        int a = standardDao.delete(id);
        return a;
    }

    @Override
    public Integer select(Thirt2 thirt) {
        Integer a = standardDao.select(thirt);
        return a;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //@Transactional
    @Override
    public void insert(Thirt2 thirt) {


        Date now = new Date();
        //当前时间
        String nowTime1 = sdf.format(now);
        try {
            thirt.setUpdateTime(sdf.parse(nowTime1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        log.info("#####################"+thirt.getStandardUrl());
        standardDao.insert(thirt);

    }

    //@Transactional
    @Override
    public void update(Thirt2 thirt) {

        Date now = new Date();
        //当前时间
        String nowTime1 = sdf.format(now);
        try {
            thirt.setUpdateTime(sdf.parse(nowTime1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        log.info("#####################"+thirt.getStandardUrl());
        standardDao.update(thirt);
    }


}
