package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.LegalpersonDao;
import com.kxj.bigscreen.entity.LegalPerson;
import com.kxj.bigscreen.model.Legalperson;
import com.kxj.bigscreen.model.LegalpersonStatus;
import com.kxj.bigscreen.service.LegalpersonService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/2 11:49
 * @Version 1.0
 */
@Service
public class LegalpersonServiceImpl implements LegalpersonService {

    @Resource
    private LegalpersonDao legalpersonDao;


    @Override
    public Map<String , List<Legalperson>> findAll(Legalperson legalperson) {
        List<Legalperson> gold = legalpersonDao.findAll(legalperson);
        List<Legalperson> original = new LinkedList();
        Legalperson gs = legalpersonDao.findGS(legalperson);
        if(gs!=null) {
            gs.setDepartment("工商");
            original.add(gs);
        }
        Legalperson zj = legalpersonDao.findZJ(legalperson);
        if(zj!=null) {
            zj.setDepartment("质监");
            original.add(zj);
        }
        Legalperson sz = legalpersonDao.findSZ(legalperson);
        if(sz!=null) {
            sz.setDepartment("市资源");
            original.add(sz);
        }
        Map<String , List<Legalperson>> map = new LinkedHashMap();
        if(!CollectionUtils.isEmpty(gold)) {
            map.put("gold", gold);
        }
        if(!CollectionUtils.isEmpty(original)) {
            map.put("original", original);
        }
        return map;
    }

    @Override
    public List<Legalperson> findVersion(Legalperson legalperson) {
        List<Legalperson> list = legalpersonDao.findVersion(legalperson);
        return list;
    }

    @Override
    public List<LegalPerson> getAll(Integer page1, Integer pagesize1) {
        List<LegalPerson> list = legalpersonDao.getAll(page1,pagesize1);
        return list;
    }


}
