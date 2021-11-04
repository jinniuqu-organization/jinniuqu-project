package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;

import com.kxj.bigscreen.entity.CharMap;
import com.kxj.bigscreen.entity.DataUpdateCondition;
import com.kxj.bigscreen.entity.Document;
import com.kxj.bigscreen.model.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface CollectNewDao {

    List<TableInfo> tableName();
    List<DatacollectGeneralInfo> getInfo();
    List<CharMap> findLine();
    List<DataUpdateCondition> findUpdate(DatacollectUpdate dataUpdateCondition);
    DatacollectGeneralService findAmount();

    List<Document> findDocumentInfo(Document document);

    List<DatacollectDocument> findDocument();



}
