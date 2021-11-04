package com.kxj.bigscreen.service;


import com.kxj.bigscreen.model.Meta;
import com.kxj.bigscreen.model.Person;
import com.kxj.bigscreen.model.PersonStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/9/10 14:11
 * @Version 1.0
 */
public interface PersonService {

    /**
     * 身份证号查询
     * @param person 身份证号码
     * @return
     */
    Map<String ,List<Person>> findAll(Person person);

    /**
     * 查询历史数据
     * @param person
     * @return
     */
    List<Person> findVersionAll(Person person);



    List<Meta> findMeta(Meta meta);
    Meta findMetaDetail(Meta meta);



}
