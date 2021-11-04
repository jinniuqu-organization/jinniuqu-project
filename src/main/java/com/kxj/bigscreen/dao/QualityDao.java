package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.model.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 11:11
 * @Version 1.0
 */
public interface QualityDao {

    DataQuality findAll();
    DataQuality threeMonth();
    List<Timely> findTimely();
    List<Detail> findDetail();
    List<QualityUpdate> findUpdate();
    List<QualityReport> findReport();
    List<ProblemBoard> repetition();
    Integer repetAmount();
    List<ProblemBoard> nullValue();
    Integer nullValueAmount();
    List<ProblemBoard> example();
    Integer exampleAmount();
    List<ProblemBoard> format();
    Integer formatAmount();
    List<ProblemBoard> master();
    Integer masterAmount();
    List<ProblemBoard> code();
    Integer codeAmount();
    List<ProblemBoard> islet();
    Integer isletAmount();

    Time time();
}
