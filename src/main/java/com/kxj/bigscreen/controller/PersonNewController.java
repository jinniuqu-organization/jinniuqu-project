package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.service.Person1Service;
import com.kxj.bigscreen.service.PersonNewService;
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
 * @Date: 2020/5/14 9:53
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/personNew")
@Api(tags="人口新大屏")
public class PersonNewController {


    @Resource
    private PersonNewService personNewService;

    @ApiOperation(value = "人口总量查询",notes="人口总量查询")
    @PostMapping("/statistics")
    public AjaxResponse statistics(@RequestBody DataviewPerArea personStatistics){
        log.error("#########查询入参为"+personStatistics);
        try{
            Boolean isEmpty = personStatistics == null || StringUtils.isEmpty(personStatistics.getDateId());
            if (isEmpty) {
                log.error("###/personStatistics 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            DataviewPerArea list = personNewService.statistics(personStatistics);
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
            List<DataviewPerArea> list = personNewService.time();
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
    public AjaxResponse sex(@RequestBody DataviewPerAge sex){
        try{
            Boolean isEmpty = sex == null || StringUtils.isEmpty(sex.getDateId());
            if (isEmpty) {
                log.error("###/sex 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewPerAge> list = personNewService.sex(sex);
            if(list!=null){
                return new AjaxResponse(200 , "男女占比查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


    @ApiOperation(value = "流动人口情况查询",notes="流动人口情况查询")
    @PostMapping("/perFloat")
    public AjaxResponse perFloat(@RequestBody DataviewPerFloat perFloat){
        try{
            Boolean isEmpty = perFloat == null || StringUtils.isEmpty(perFloat.getDateId());
            if (isEmpty) {
                log.error("###/perFloat 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewPerFloat> list = personNewService.perFloat(perFloat);
            if(list!=null){
                return new AjaxResponse(200 , "流动人口情况查询",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "注册技防情况查询",notes="注册技防情况查询")
    @PostMapping("/jf")
    public AjaxResponse jf(@RequestBody DataviewPerJf jf){
        try{
            Boolean isEmpty = jf == null || StringUtils.isEmpty(jf.getDateId());
            if (isEmpty) {
                log.error("###/jf 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewPerJf> list = personNewService.jf(jf);
            if(list!=null){
                return new AjaxResponse(200 , "注册技防情况查询",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }

    @ApiOperation(value = "疫苗接种情况查询",notes="疫苗接种情况查询")
    @PostMapping("/ym")
    public AjaxResponse ym(@RequestBody DataviewPerYm ym){
        try{
            Boolean isEmpty = ym == null || StringUtils.isEmpty(ym.getDateId());
            if (isEmpty) {
                log.error("###/ym 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewPerYm> list = personNewService.ym(ym);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "疫苗接种情况查询",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }



    @ApiOperation(value = "街道人口总量查询",notes="街道人口总量查询")
    @PostMapping("/gross")
    public AjaxResponse area(@RequestBody DataviewPerArea area){
        try{
            Boolean isEmpty = area == null || StringUtils.isEmpty(area.getDateId());
            if (isEmpty) {
                log.error("###/area 查询入参为空");
                return new AjaxResponse(201,"必要参数dateId为空");
            }
            List<DataviewPerArea> list = personNewService.personArea(area);
            if(list!=null){
                return new AjaxResponse(200 , "街道人口总量查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


}
