package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.model.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:15
 * @Version 1.0
 */
public interface StandardDao {

    List<Standard> findStandard();
    List<SecondTitle> findTitle(Standard standard);
    List<StandardMap> findPdf(Standard standard);
    List<StandardAmount> findAmount();
    StandardAmount findItem();
    Integer findTotal(Standard standard);
    List<StandardMap> search(StandardMap standardMap);
    List<FirstTitle> findAll();

    int delete(Integer id);

    Integer select(Thirt2 thirt);

    int insert(Thirt2 thirt);

    int update (Thirt2 thirt);
}
