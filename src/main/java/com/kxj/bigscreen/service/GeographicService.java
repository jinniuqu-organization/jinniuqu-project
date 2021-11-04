package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.Geographic;
import com.kxj.bigscreen.entity.GeographicInfo;
import com.kxj.bigscreen.entity.GeographicSummary;

import java.util.List;

/**
 * @Acthor Tao.Lee @date 2021/10/18 14:41
 * @Description
 */
public interface GeographicService {

    List<Geographic> getGeographicName();
    //查询地理信息字段名
    GeographicInfo getGeographicInfo(Integer id);
    //查询地理信息详请
    List<GeographicSummary> getGeographicSummary(Integer searchId);
    //名称查询地理信息详请
    List<GeographicSummary> getGeographicSummaryName(Integer searchId,String name);
}
