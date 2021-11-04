package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface LabelDao {

    DataservPersonGzdz gzdz (DataservPersonGzdz gz);

    DataservPersonHjdz hjdz (DataservPersonHjdz hj);

    DataservPersonJzdz jzdz (DataservPersonJzdz jz);

    DataservPersonalLabel label (DataservPersonalLabel la);

    List<DataservRelationChain> chain (DataservRelationChain ch);

    DataservRelationLabel rela (DataservRelationLabel re);

    List<DataservNewsRecommend> news (DataservNewsRecommend news);

    //关系链表格数据3条
    List<DataservPersonalLabel> chainLabel (DataservPersonalLabel la);

    //关系链表格信息详情
    List<DataservPersonalLabel> chainLabel1 (DataservPersonalLabel la);

    Time time();
}
