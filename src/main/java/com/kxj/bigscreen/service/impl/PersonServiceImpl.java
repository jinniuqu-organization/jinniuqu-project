package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.PersonDao;
import com.kxj.bigscreen.model.Meta;
import com.kxj.bigscreen.model.Person;
import com.kxj.bigscreen.model.PersonStatus;
import com.kxj.bigscreen.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/2 11:48
 * @Version 1.0
 */
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {


    @Resource
    private PersonDao personDao;

    @Override
    public Map<String ,List<Person>> findAll(Person person) {
        List<Person> gold = personDao.findPerson(person);
        List<Person> original = new LinkedList();
        Person mz =  personDao.findMZ(person);
        if(mz != null){
            mz.setDepartment("民政");
            original.add(mz);
        }

        Person lg = personDao.findLG(person);
        if(lg != null){
            lg.setDepartment("流管");
            original.add(lg);
        }

        Person cl = personDao.findCL(person);
        if(cl!=null ){
            cl.setDepartment("残联");
            original.add(cl);
        }

        Person xcaj = personDao.findXCAJ(person);
        if(xcaj!=null ){
            xcaj.setDepartment("西长安街");
            original.add(xcaj);
        }

        Person wj = personDao.findWj(person);
        if(wj!=null ){
            wj.setDepartment("卫健");
            original.add(wj);
        }

        Map<String ,List<Person>> map = new LinkedHashMap();
        if(!CollectionUtils.isEmpty(gold) ) {
            map.put("gold", gold);
        }

        if(!CollectionUtils.isEmpty(original) ) {
            map.put("original", original);
        }
        log.info("##########",map);
        return map;
    }

    @Override
    public List<Person> findVersionAll(Person person) {
        List<Person> list = personDao.findVersionAll(person);
        return list;
    }

    @Override
    public List<Meta> findMeta(Meta meta) {
        List<Meta> list = personDao.findMeta(meta);
        return list;
    }

    @Override
    public Meta findMetaDetail(Meta meta) {
        Meta list = personDao.findMetaDetail(meta);
        return list;
    }


}
