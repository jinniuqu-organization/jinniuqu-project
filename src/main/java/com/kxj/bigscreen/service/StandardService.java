package com.kxj.bigscreen.service;

import com.kxj.bigscreen.model.*;
import net.sf.jsqlparser.statement.select.First;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:15
 * @Version 1.0
 */
public interface StandardService {

    List<Standard> findStandard();
    List<SecondTitle> findTitle(Standard standard);
    Map<String , List<StandardMap>> findPdf(Standard standard);
    HashMap findAmount();
    List<StandardMap> search(StandardMap standardMap);
    List<FirstTitle> findAll();
    int delete(Integer id);

    Integer select(Thirt2 thirt);

    void insert(Thirt2 thirt);

    void update(Thirt2 thirt);
}
