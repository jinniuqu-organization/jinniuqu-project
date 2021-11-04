package com.kxj.bigscreen.dao;


import com.kxj.bigscreen.entity.Area;
import com.kxj.bigscreen.model.Meta;
import com.kxj.bigscreen.model.Person;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/9/10 12:08
 * @Version 1.0
 */
public interface PersonDao {

    /**
     * 身份证号查询
     * @param person
     * @return
     */
    List<Person> findPerson(Person person);

    /**民政原始数据*/
    Person findMZ(Person person);

    /**残联原始数据*/
    Person findCL(Person person);

    /**西长安街原始数据*/
    Person findXCAJ(Person person);

    /**流管原始数据*/
    Person findLG(Person person);

    /**卫建数据*/
    Person findWj(Person person);
    /**
     * 查询历史数据
     * @param person
     * @return
     */
    List<Person> findVersionAll(Person person);

    List<Meta> findMeta(Meta meta);
    Meta findMetaDetail(Meta meta);





}
