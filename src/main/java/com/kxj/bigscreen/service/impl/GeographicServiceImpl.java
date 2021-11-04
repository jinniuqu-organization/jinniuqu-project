package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.GeographicDao;
import com.kxj.bigscreen.entity.Geographic;
import com.kxj.bigscreen.entity.GeographicInfo;
import com.kxj.bigscreen.entity.GeographicSummary;
import com.kxj.bigscreen.service.GeographicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Acthor Tao.Lee @date 2021/10/18 14:43
 * @Description
 */
@Service
@Slf4j
public class GeographicServiceImpl implements GeographicService {

    @Resource
    private GeographicDao geographicDao;

    @Override
    public List<Geographic> getGeographicName() {
        List<Geographic> list=geographicDao.getGeographicName();
        return list;
    }

    @Override
    public GeographicInfo getGeographicInfo(Integer id) {
        GeographicInfo geographicInfo=geographicDao.getGeographicInfo(id);
        return geographicInfo;
    }

    @Override
    public List<GeographicSummary> getGeographicSummary(Integer searchId) {
        List<GeographicSummary> geographicSummary=geographicDao.getGeographicSummary(searchId);
        return geographicSummary;
    }

    @Override
    public List<GeographicSummary> getGeographicSummaryName(Integer searchId, String name) {
        List<GeographicSummary> geographicSummary=geographicDao.getGeographicSummaryName(searchId,name);
        return geographicSummary;
    }

}
