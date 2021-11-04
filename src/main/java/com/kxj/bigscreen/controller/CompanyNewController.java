package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.service.CompanyNewService;
import com.kxj.bigscreen.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/5/15 17:15
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/companyNew")
@Api(tags="企业新大屏")
public class CompanyNewController {


    @Resource
    private CompanyNewService companyNewService;

    @ApiOperation(value = "公司状态信息",notes="公司状态信息")
    @PostMapping("/state")
    public AjaxResponse category(@RequestBody DataviewLegalState companyCategory){
        try{
            Boolean isEmpty = companyCategory == null || StringUtils.isEmpty(companyCategory.getDateId());
            if (isEmpty) {
                log.error("###/companyCategory 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            DataviewLegalState list = companyNewService.state(companyCategory);
            if(list != null){
                return new AjaxResponse(200 , "行业类别查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }




    @ApiOperation(value = "时间轴查询",notes="时间轴查询")
    @PostMapping("/time")
    public AjaxResponse time(){
        try{
            List<DataviewLegalState> list = companyNewService.time();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "时间轴查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }




    @ApiOperation(value = "街道企业总量查询",notes="街道企业总量查询")
    @PostMapping("/comArea")
    public AjaxResponse area(@RequestBody DataviewLegalState area){
        try{
            Boolean isEmpty = area == null || StringUtils.isEmpty(area.getDateId());
            if (isEmpty) {
                log.error("###/area 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewLegalState> list = companyNewService.comArea(area);
            if(list!=null){
                return new AjaxResponse(200 , "街道企业总量查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


    @ApiOperation(value = "企业行业类别查询",notes="企业行业类别查询")
    @PostMapping("/industry")
    public AjaxResponse industry(@RequestBody DataviewLegalIndustry dataviewLegalIndustry){
        try{
            Boolean isEmpty = dataviewLegalIndustry == null || StringUtils.isEmpty(dataviewLegalIndustry.getDateId());
            if (isEmpty) {
                log.error("###/dataviewLegalIndustry 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewLegalIndustry> list = companyNewService.industry(dataviewLegalIndustry);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "行业类别查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "经济类型查询",notes="经济类型查询")
    @PostMapping("/economic")
    public AjaxResponse economic(@RequestBody DataviewLegalEconomic dataviewLegalEconomic){
        try{
            Boolean isEmpty = dataviewLegalEconomic == null || StringUtils.isEmpty(dataviewLegalEconomic.getDateId());
            if (isEmpty) {
                log.error("###/dataviewLegalEconomic 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List list = companyNewService.economic(dataviewLegalEconomic);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "经济类型查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "企业异常趋势查询",notes="企业异常趋势查询")
    @PostMapping("/unusual")
    public AjaxResponse unusual(@RequestBody Unusual unusual){
        try{
            Boolean isEmpty = unusual == null || StringUtils.isEmpty(unusual.getDateId());
            if (isEmpty) {
                log.error("###/unusual 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<Unusual> list = companyNewService.unusual(unusual);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "企业异常趋势查询",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }
}
