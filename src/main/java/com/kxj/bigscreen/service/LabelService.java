package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:38
 * @Version 1.0
 */
public interface LabelService {

    DataservPersonGzdz gzdz (DataservPersonGzdz gz);

    DataservPersonHjdz hjdz (DataservPersonHjdz hj);

    DataservPersonJzdz jzdz (DataservPersonJzdz jz);

    DataservPersonalLabel label (DataservPersonalLabel la);

    List<DataservRelationChain> chain (DataservRelationChain ch);

    DataservRelationLabel rela (DataservRelationLabel re);

    List<DataservNewsRecommend> news (DataservNewsRecommend news);

    List<DataservPersonalLabel> chainLabel (DataservPersonalLabel la);

    List<DataservPersonalLabel> chainLabel1 (DataservPersonalLabel la);

    AuthReault auth(String idCard);

}
