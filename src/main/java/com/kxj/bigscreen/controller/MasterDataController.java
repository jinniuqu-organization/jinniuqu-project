package com.kxj.bigscreen.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.service.MasterDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Leetao
 * @Date: 2021/09/26 15:39
 * @Version 2.0
 */
@RestController
@Slf4j
@Api(tags = "主数据大屏")
@RequestMapping("/master")
public class MasterDataController {


    @Resource
    private MasterDataService masterDataService;




    @ApiOperation(value = "人口信息", notes = "人口信息")
    @PostMapping("/person")
    public AjaxResponse person(@RequestBody Person1 data) {

        if (data.getPageNum() == null || data.getPageNum() == 0) {
            data.setPageNum(1);
        }

        log.info("##################" + data.getPageNum());
        PageHelper.startPage(data.getPageNum(), 10);
        log.info("##########查询入参为" + data);
        if(data.getParameter() == "" ){
            try {
                log.info("##########此条记录代表参数为空");
                List<Person1> list = masterDataService.personAll(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<Person1> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "人口信息", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType()==null || data.getType().equals("1")&&data.getParameter()!="") {
            try {

                List<Person1> list = masterDataService.person(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<Person1> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "人口信息", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("2")&&data.getParameter()!=""){
            try {

                List<Person1> list = masterDataService.personName(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<Person1> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "模糊查询姓名人口信息", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("3")&&data.getParameter()!=""){
            try {

                List<Person1> list = masterDataService.personStreet(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<Person1> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "模糊查询街道人口信息", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "人口信息详情", notes = "人口信息详情")
    @PostMapping("/getInfo")
    public AjaxResponse getInfo(@RequestBody String str) {

        try {
            if (str == null || str=="") {
                return new AjaxResponse(201, "必要参数为空", null);
                }
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        Integer id = Integer.parseInt(str);
        log.info("##########查询入参为" + id);
        try {
            //改为传id
            List<PersonInfo> list = masterDataService.personInfo(id);
            if (!CollectionUtils.isEmpty(list)) {
                return new AjaxResponse(200, "人口信息详情查询成功", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "法人信息", notes = "法人信息")
    @PostMapping("/legal")
    public AjaxResponse legal(@RequestBody LegalPerson data) {

        if (data.getPageNum() == null || data.getPageNum() == 0) {
            data.setPageNum(1);
        }
        log.info("##################" + data.getPageNum());
        PageHelper.startPage(data.getPageNum(), 10);
        log.info("##########查询入参为" + data);

        if(data.getParameter() == "" ){
            if(data.getType().equals("4")) {
                try{
                    List<LegalPerson> list=masterDataService.legalMoneyNopar();
                    if (!CollectionUtils.isEmpty(list)) {
                        PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                        return new AjaxResponse(200, "法人信息全部资金查询成功", pageInfo);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(data.getType().equals("5")) {
                try{
                    data.setParameter("企业");
                    List<LegalPerson> list=masterDataService.legalEntType(data);
                    if (!CollectionUtils.isEmpty(list)) {
                        PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                        return new AjaxResponse(200, "法人类型信息查询成功", pageInfo);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else {
                log.info("此条记录代表法人参数为空查询所有");
                try {
                    List<LegalPerson> list = masterDataService.legalAll(data);
                    if (!CollectionUtils.isEmpty(list)) {
                        PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                        return new AjaxResponse(200, "法人全部信息查询成功", pageInfo);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else if(data.getType().equals("1") || data.getType() == null  && data.getParameter()!="") {
            try {
                List<LegalPerson> list = masterDataService.legal(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息信用号模糊查询成功", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("2") && data.getParameter()!=""){
            try {
                List<LegalPerson> list = masterDataService.legalCompany(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息公司模糊查询成功", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("3") && data.getParameter()!=""){
            try {
                List<LegalPerson> list = masterDataService.legalPeopel(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息法人代表模糊查询成功", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("4") && data.getParameter()!=null && data.getParameter()!=""){
            try {
                String strmoney=data.getParameter();
                Integer intmoney=null;
                if(strmoney!=null){
                    intmoney=Integer.valueOf(strmoney);
                }
                log.info("金额查询参数为####"+intmoney);
                List<LegalPerson> list = masterDataService.legalMoney(intmoney);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息注册资金大于查询成功", pageInfo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(data.getType().equals("5") && data.getParameter()!=""){
            try{
                log.info("企业类型为####"+data.getParameter());
                List<LegalPerson> list = masterDataService.legalEntType(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息企业类型查询成功", pageInfo);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(data.getType().equals("6") && data.getParameter()!=""){
            try{
                log.info("管理所为####"+data.getParameter());
                List<LegalPerson> list = masterDataService.legalManagement(data);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<LegalPerson> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "法人信息所属管理所查询成功", pageInfo);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "法人信息详情", notes = "法人信息详情")
    @PostMapping("/legalInfo")
    public AjaxResponse legalInfo(@RequestBody String uniScid) {

        if (StringUtils.isEmpty(uniScid)) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + uniScid);
        try {

            String uni = uniScid.replace("\"","");

            log.info("##############"+uni);
            List<PersonInfo> list = masterDataService.legalInfo(uni);
            if (!CollectionUtils.isEmpty(list)) {
                return new AjaxResponse(200, "法人信息详情查询成功", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }


    @PostMapping("/api")
    @ApiOperation(value = "api接口详情", notes = "api接口详情")
    public AjaxResponse apiInfo(){

        try{
            List<ApiInfo> list = masterDataService.api();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "api接口详情查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

}

