package com.kxj.bigscreen.dao;


import com.kxj.bigscreen.model.Legalperson;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/11/18 17:50
 * @Version 1.0
 */
public interface LegalpersonDao {

    /**
     * 查询法人库信息
     * @param legalperson
     * @return
     */
    List<Legalperson> findAll(Legalperson legalperson);

    /**查询工商数据*/
    Legalperson findGS(Legalperson legalperson);

    /**查询质检数据*/
    Legalperson findZJ(Legalperson legalperson);

    /**查询市资源数据*/
    Legalperson findSZ(Legalperson legalperson);

    /**
     * 查询历史版本
     * @param legalperson
     * @return
     */
    List<Legalperson> findVersion(Legalperson legalperson);


}
