package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.QualityDao;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.QualityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.text.DecimalFormat;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 11:15
 * @Version 1.0
 */
@Service
@Slf4j
public class QualityServiceImpl implements QualityService {

    @Resource
    private QualityDao qualityDao;

    //除去double后面的0
    DecimalFormat decimalFormat = new DecimalFormat("###################");
    @Override
    public DataQuality findAll() {
        DataQuality list = qualityDao.findAll();
        log.info("##################"+list.getRuleGross());
        try {
            DataQuality list1 = qualityDao.threeMonth();

            log.info("##################"+list.getRuleGross());
            list.setThreeMonthHold(decimalFormat.format((list.getRuleGross()-list1.getRuleGross())/Double.valueOf(list1.getRuleGross())*100)+"%");

        }catch (Exception e){
            e.printStackTrace();
        }
        list.setHoldGross(decimalFormat.format((Double.parseDouble(list.getHoldGross())) * 100) + "%");
        list.setHoldProblem(decimalFormat.format((Double.parseDouble(list.getHoldProblem())) * 100) + "%");
        return list;

    }

    @Override
    public List<Timely> findTimely() {
        List<Timely> list = qualityDao.findTimely();
        return list;
    }

    @Override
    public List<Detail> findDetail() {
        List<Detail> list = qualityDao.findDetail();
        for (Detail data:list) {
            data.setTableSize(data.getTableSize()+"M");
        }
        return list;
    }

    @Override
    public List<QualityUpdate> findUpdate() {
        List<QualityUpdate> list = qualityDao.findUpdate();
        for (QualityUpdate data:list) {
           data.setSourceHold(decimalFormat.format(Double.parseDouble(data.getSourceHold())*100)+"%");
           data.setOptimizeHold(decimalFormat.format(Double.parseDouble(data.getOptimizeHold())*100)+"%");
           data.setQualityPromote(decimalFormat.format(Double.parseDouble(data.getQualityPromote())*100)+"%");
        }
        return list;
    }

    @Override
    public List<QualityReport> findReport() {
        List<QualityReport> list = qualityDao.findReport();
        return list;
    }

    @Override
    public List<ProblemBoard> findBoard() {
        List<ProblemBoard> repetition = qualityDao.repetition();
        Integer repeAmount = qualityDao.repetAmount();
        for (ProblemBoard data:repetition) {
            data.setTotal(String.valueOf(repeAmount));
        }
        List<ProblemBoard> nullValue = qualityDao.nullValue();

        Integer nullAmount = qualityDao.nullValueAmount();
        for (ProblemBoard data: nullValue) {
            data.setTotal(String.valueOf(nullAmount));
        }
        List<ProblemBoard> example= qualityDao.example();
        Integer exampleAmount = qualityDao.exampleAmount();
        for (ProblemBoard data:example){
            data.setTotal(String.valueOf(exampleAmount));
        }
        List<ProblemBoard> format = qualityDao.format();
        Integer formatAmount = qualityDao.formatAmount();
        for (ProblemBoard data:format) {
            data.setTotal(String.valueOf(formatAmount));
        }
        List<ProblemBoard> master = qualityDao.master();
        Integer masterAmount = qualityDao.masterAmount();
        for (ProblemBoard data:master) {
            data.setTotal(String.valueOf(masterAmount));
        }
        List<ProblemBoard> code = qualityDao.code();
        Integer codeAmount = qualityDao.codeAmount();
        for (ProblemBoard data:code) {
            data.setTotal(String.valueOf(codeAmount));
        }
        List<ProblemBoard> islet = qualityDao.islet();
        Integer isletAmount = qualityDao.isletAmount();
        for (ProblemBoard data:islet) {
            data.setTotal(String.valueOf(isletAmount));
        }
        LinkedList list = new LinkedList(repetition);
        list.addAll(nullValue);
        list.addAll(example);
        list.addAll(format);
        list.addAll(master);
        list.addAll(code);
        list.addAll(islet);
        return list;
    }


}
