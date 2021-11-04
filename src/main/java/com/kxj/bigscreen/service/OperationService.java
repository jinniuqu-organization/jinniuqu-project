package com.kxj.bigscreen.service;

import com.kxj.bigscreen.model.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:44
 * @Version 1.0
 */
public interface OperationService {

    HashMap findStandard();
    List<DataGovernBasis> findBasis();
    List<DataGovernBasis> findBasisPdf(DataGovernBasis dataGovernBasis);
    List<DataGovernServer> findServer();

    List<CodeServer> findCodeServer();
    List<StandardTop> findStandardTop();
    List<CodeTop> findCodeTop();
    List<CodeStandard> findWord();

}
