package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:38
 * @Version 1.0
 */
public interface MasterDataService {
    //查询所有人口
    List<Person1> personAll(Person1 data);

    List<Person1> person(Person1 data);
    //模糊查询姓名
    List<Person1> personName(Person1 data);

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

    //接口服务
    List<ApiInfo> api();
}
