package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.dao.CompanyDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
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
@RequestMapping("/company")
@Api(tags="企业大屏")
public class CompanyController {


    @Resource
    private CompanyService companyService;

    @ApiOperation(value = "企业行业类别查询",notes="企业行业类别查询")
    @PostMapping("/category")
    public AjaxResponse category(@RequestBody CompanyCategory companyCategory){
        try{
            List list = companyService.category(companyCategory);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "行业类别查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "企业类型查询",notes="企业类型查询")
    @PostMapping("/companyType")
    public AjaxResponse companyType(@RequestBody CompanyType companyType){
        try{
            List list = companyService.companyType(companyType);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "企业类型查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "企业数量趋势查询",notes="企业数量趋势查询")
    @PostMapping("/number")
    public AjaxResponse companyNumber(@RequestBody Company company){
        try{
            List<Company> list = companyService.companyNumber(company);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "企业数量趋势查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "街道企业数量查询",notes="街道企业数量查询")
    @PostMapping("/area")
    public AjaxResponse area(@RequestBody ComGross comGross){
        try{
            List<ComGross> list = companyService.companyArea(comGross);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "街道企业数量查询成功",list);
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
            List<Company> list = companyService.time();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "时间轴查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "企业总量查询",notes="企业总量查询")
    @PostMapping("/gross")
    public AjaxResponse gross(@RequestBody ComGross company){
        try{
            List<ComGross> list = companyService.company(company);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "企业总量查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "企业详情查询",notes="企业详情查询")
    @PostMapping("/detail")
    public AjaxResponse detail(@RequestBody CompanyDetail companyDetail){
        try{
            List<CompanyDetail> list = companyService.detail(companyDetail);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "企业详情查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "街道企业总量查询",notes="街道企业总量查询")
    @PostMapping("/comArea")
    public AjaxResponse area(@RequestBody Area area){
        try{
            List<Area> list = companyService.comArea(area);
            if(list!=null){
                return new AjaxResponse(200 , "街道企业总量查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

}
