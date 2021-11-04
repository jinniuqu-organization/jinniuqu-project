package com.kxj.bigscreen.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.QualityService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 11:17
 * @Version 1.0
 */

@RestController
@Slf4j
@Api(tags="质量监控大屏")
public class QualityController {

    @Resource
    private QualityService qualityService;

    @PostMapping("/quality/all")
    public AjaxResponse findAll(){
        try {
            DataQuality list = qualityService.findAll();

            if(list!=null){
                if(list.getThreeMonthHold()==null){
                    list.setThreeMonthHold(0+"%");
                }
                return new AjaxResponse(200 , "数据查询成功", list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
            return new AjaxResponse(201, "数据查询失败", null);
    }

    @PostMapping("/quality/timeliness")
    public AjaxResponse findTimely(){
        try {
            List<Timely> list = qualityService.findTimely();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查询数据成功", list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "查询数据失败",null);

    }

    @PostMapping("/quality/detail")
    public AjaxResponse findDetail(){
        try {
            //List<Detail> list = qualityService.findDetail(detail);
            //PageHelper.startPage(pageNum,pageSize);
            List<Detail> list = qualityService.findDetail();
            //PageInfo<Detail> pageInfo = new PageInfo<>(list);
                return new AjaxResponse(200 , "数据查询成功",list);

        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据查询失败",null);
    }

    @PostMapping("/quality/lift")
    public AjaxResponse findUpdate(){
        try {
            List<QualityUpdate> list = qualityService.findUpdate();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查询数据成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据查询失败",null);
    }

    @PostMapping("/quality/report")
    public AjaxResponse findReport(){
        try{
            List<QualityReport> list = qualityService.findReport();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "数据查询成功", list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据查询失败", null);
    }


    @PostMapping("/quality/board")
    public AjaxResponse findBoard(){
        try {
            List<ProblemBoard> list = qualityService.findBoard();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据查询失败",null);
    }
}
