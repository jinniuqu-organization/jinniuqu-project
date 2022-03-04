package com.kxj.bigscreen.service.impl;

import com.kxj.bigscreen.dao.MasterDataDao;
import com.kxj.bigscreen.entity.*;

import com.kxj.bigscreen.model.Legalperson;
import com.kxj.bigscreen.service.MasterDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: Leetao
 * @Date: 2021/09/26 15:39
 * @Version 2.0
 */
@Service
@Slf4j
public class MasterDataServiceImpl implements MasterDataService {


   @Resource
    private MasterDataDao masterDataDao;

    @Override
    public List<Person1> personAll(Person1 data) {
        List<Person1> list = masterDataDao.personAll(data);
        return list;
    }

    @Override
    public List<Person1> person(Person1 data) {
        List<Person1> list = masterDataDao.person(data);
        return list;
    }

    @Override
    public List<Person1> personName(Person1 data) {
        List<Person1> list = masterDataDao.personName(data);
        return list;
    }

    @Override
    public List<Person1> personStreet(Person1 data) {
        List<Person1> list = masterDataDao.personStreet(data);
        return list;
    }

    @Override
    public List<PersonInfo> personInfo(Integer id) {
        List<PersonInfo> data = masterDataDao.personInfo(id);
        return data;
    }

    @Override
    public List<LegalPerson> legalAll(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legalAll(data);
        return list;
    }

    @Override
    public List<LegalPerson> legal(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legal(data);
        return list;
    }

    @Override
    public List<LegalPerson> legalCompany(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legalCompany(data);
        return list;
    }

    @Override
    public List<LegalPerson> legalPeopel(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legalPeopel(data);
        return list;
    }

    @Override
    public List<LegalPerson> legalEntType(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legalEntType(data);
        return list;
    }

    @Override
    public List<LegalPerson> legalMoney(Integer intmoney) {
        List<LegalPerson> list = masterDataDao.legalMoney(intmoney);
        return list;
    }

    @Override
    public List<LegalPerson> legalMoneyNopar() {
        List<LegalPerson> list = masterDataDao.legalMoneyNopar();
        return list;
    }

    @Override
    public List<LegalPerson> legalManagement(LegalPerson data) {
        List<LegalPerson> list = masterDataDao.legalManagement(data);
        return list;
    }

    @Override
    public List<PersonInfo> legalInfo(String uniScid) {
        List<PersonInfo> data = masterDataDao.legalInfo(uniScid);
        return data;
    }


    @Override
    public List<ApiInfo> api() {
        List<ApiInfo> list = masterDataDao.api();
        return list;
    }
}
