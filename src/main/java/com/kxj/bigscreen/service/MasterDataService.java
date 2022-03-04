package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.List;

/**
 * @Author: Leetao
 * @Date: 2021/09/26 15:39
 * @Version 2.0
 */
public interface MasterDataService {
    //查询所有人口
    List<Person1> personAll(Person1 data);
    //身份证号查询
    List<Person1> person(Person1 data);
    //模糊查询姓名
    List<Person1> personName(Person1 data);
    //模糊查询街道
    List<Person1> personStreet(Person1 data);

    List<PersonInfo> personInfo(Integer id);

    //查询所有法人
    List<LegalPerson> legalAll(LegalPerson data);

    List<LegalPerson> legal(LegalPerson data);
    //模糊公司名,法人，注册资金
    List<LegalPerson> legalCompany(LegalPerson data);

    List<LegalPerson> legalPeopel(LegalPerson data);

    List<LegalPerson> legalEntType(LegalPerson data);

    List<LegalPerson> legalMoney(Integer intmoney);

    List<LegalPerson> legalMoneyNopar();

    List<PersonInfo> legalInfo(String uniScid);
    //模糊查询所属市管理所
    List<LegalPerson> legalManagement(LegalPerson data);

    //接口服务
    List<ApiInfo> api();
}
