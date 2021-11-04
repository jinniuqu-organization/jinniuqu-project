package com.kxj.bigscreen.service;

import com.kxj.bigscreen.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 11:13
 * @Version 1.0
 */
public interface QualityService {

    DataQuality findAll();
    List<Timely> findTimely();
    List<Detail> findDetail();
    List<QualityUpdate> findUpdate();
    List<QualityReport> findReport();
    List<ProblemBoard> findBoard();
}
