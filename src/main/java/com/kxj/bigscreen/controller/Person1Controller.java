package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.model.Meta;
import com.kxj.bigscreen.service.Person1Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
 * @Date: 2020/5/14 9:53
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/person")
@Api(tags="人口大屏")
public class Person1Controller {


    @Resource
    private Person1Service person1Service;

    @ApiOperation(value = "人口总量查询",notes="人口总量查询")
    @PostMapping("/statistics")
    public AjaxResponse statistics(@RequestBody PersonStatistics personStatistics){
        log.error("#########查询入参为"+personStatistics);
        try{
            PersonStatistics list = person1Service.statistics(personStatistics);
            if(list != null){
                return new AjaxResponse(200 , "人口总量查询成功",list);
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
            List<PersonStatistics> list = person1Service.time();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "时间轴查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "性别情况查询",notes="性别情况查询")
    @PostMapping("/sex")
    public AjaxResponse sex(@RequestBody Sex sex){
        try{
            Sex list = person1Service.sex(sex);
            if(list!=null){
                return new AjaxResponse(200 , "男女占比查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


    @ApiOperation(value = "婚姻情况查询",notes="婚姻情况查询")
    @PostMapping("/marriage")
    public AjaxResponse marriage(@RequestBody Marriage marriage){
        try{
            Marriage list = person1Service.marriage(marriage);
            if(list!=null){
                return new AjaxResponse(200 , "婚姻情况查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "残疾、党员情况查询",notes="残疾、党员情况查询")
    @PostMapping("/personLabel")
    public AjaxResponse personLabel(@RequestBody PersonLabel personLabel){
        try{
            PersonLabel list = person1Service.personLabel(personLabel);
            if(list!=null){
                return new AjaxResponse(200 , "残疾、党员情况查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "学历情况查询",notes="学历情况查询")
    @PostMapping("/education")
    public AjaxResponse education(@RequestBody Education education){
        try{
            List list = person1Service.education(education);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "学历情况查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "年龄分布查询",notes="年龄分布查询")
    @PostMapping("/ageDistribute")
    public AjaxResponse ageDistribute(@RequestBody AgeDistribute ageDistribute){
        try{
            List<AgeDistribute> list = person1Service.ageDistribute(ageDistribute);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "年龄分布查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "街道性别查询",notes="街道性别查询")
    @PostMapping("/area")
    public AjaxResponse area(@RequestBody AgeDistribute ageDistribute){
        try{
            List<AgeDistribute> list = person1Service.area(ageDistribute);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "街道性别查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "街道人口总量查询",notes="街道人口总量查询")
    @PostMapping("/gross")
    public AjaxResponse area(@RequestBody Area area){
        try{
            List<Area> list = person1Service.personArea(area);
            if(list!=null){
                return new AjaxResponse(200 , "街道人口总量查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "街道详情查询",notes="街道详情查询")
    @PostMapping("/detail")
    public AjaxResponse detail(@RequestBody PersonDetail personDetail){
        try{
            List<PersonDetail> list = person1Service.detail(personDetail);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "人口详情查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }
}
