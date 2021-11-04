package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.model.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:43
 * @Version 1.0
 */
public interface OperationDao {

    List<StandardMonitor> findClean();
    List<StandardMonitor> findOptimization();
    List<StandardMonitor> findStandard();
    List<StandardMonitor> findFuse();
    Integer dataAmount();
    List<DataGovernBasis> findBasis();
    List<DataGovernBasis> findBasisPdf(DataGovernBasis dataGovernBasis);
    List<DataGovernServer> findServer();
    List<CodeServer> findOriginal();
    List<CodeServer> findStandards();
    List<CodeMap> findCodeMap();
    List<StandardTop> findStandardTop();
    List<CodeTop> findCodeTop();
    List<CodeStandard> findWord();

    Time updateTime();
    Time updateTimes();
}
