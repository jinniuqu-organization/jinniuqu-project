package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.Time;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:41
 * @Version 1.0
 */
public interface MasterDataDao {

    //查询所有
    List<Person1> personAll(Person1 data);
    //身份证号查询
    List<Person1> person(Person1 data);
    //模糊查询街道
    List<Person1> personStreet(Person1 data);

    List<Person1> personName(Person1 data);

    List<PersonInfo> personInfo(Integer id);

//查询所有法人
    List<LegalPerson> legalAll(LegalPerson data);

    List<LegalPerson> legal(LegalPerson data);

    List<LegalPerson> legalCompany(LegalPerson data);

    List<LegalPerson> legalPeopel(LegalPerson data);
    //查询企业类型是个体户 还是企业
    List<LegalPerson> legalEntType(LegalPerson data);

    List<LegalPerson> legalMoney(Integer intmoney);

    List<LegalPerson> legalMoneyNopar();

    List<PersonInfo> legalInfo(String uniScid);
    //模糊查询所属市管理所
    List<LegalPerson> legalManagement(LegalPerson data);

    //接口服务
    List<ApiInfo> api();
}
