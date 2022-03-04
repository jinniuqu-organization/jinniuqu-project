package com.kxj.bigscreen.service;


import com.kxj.bigscreen.entity.LegalPerson;
import com.kxj.bigscreen.model.Legalperson;
import com.kxj.bigscreen.model.LegalpersonStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/11/18 17:10
 * @Version 1.0
 */

public interface LegalpersonService {

    /**
     * 法人库信息查询
     * @param legalperson
     * @return
     */
    Map<String , List<Legalperson>> findAll(Legalperson legalperson);

    /**
     * 查询历史数据
     * @param legalperson
     * @return
     */
    List<Legalperson> findVersion(Legalperson legalperson);

    /**
     * api测试
     * @param page1,pagesize1
     * @return
     */
    List<LegalPerson> getAll(Integer page1, Integer pagesize1);

}
