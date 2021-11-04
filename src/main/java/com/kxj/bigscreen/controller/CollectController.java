package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:25
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="汇集监控大屏")
public class CollectController {


    @Resource
    private CollectService collectService;

    @PostMapping("/monitor/collect")
    @ApiOperation(value = "各委办局数据",notes="各委办局数据")
    public AjaxResponse findDe(){
        //AjaxResponse ajaxResponse = new AjaxResponse();

        try{
            List<CollectCondition> list = collectService.findDe();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"操作成功",list);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库不存在此信息",null);
    }

    @PostMapping("/monitor/chart")
    @ApiOperation(value = "线性图",notes="线性图")
    public AjaxResponse findLine (){
        log.error("##########查询入参为");

        try{
            List<CharMap> list = collectService.findLine();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "未查到此信息",null);
    }



    @PostMapping("/monitor/getInfo")
    @ApiOperation(value = "详细信息",notes="详细信息")
    public AjaxResponse findData(@RequestBody CollectCondition collectCondition){

        log.info("#########查询入参为"+collectCondition);
        try{
            List list = collectService.findData(collectCondition);
            if(!CollectionUtils.isEmpty(list)){
               return new AjaxResponse(200,"数据库查到数据",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库未查到信息",null);
    }

    @PostMapping("/monitor/update")
    @ApiOperation(value = "更新数据",notes="跟新数据")
    public AjaxResponse findUpdate(@RequestBody DataUpdateCondition updateCondition){
        log.info("#########查询入参为"+updateCondition);
        try{
            List<DataUpdateCondition> list = collectService.findUpdate(updateCondition);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200, "更新情况查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库没有此信息",null);
    }

    @PostMapping("/monitor/all")
    @ApiOperation(value = "整体采集情况",notes="整体采集情况")
    public AjaxResponse findAmount(){
        try{
            DataCollect list = collectService.findAmount();
            if(list != null){
                return new AjaxResponse(200, "数据总量查询成功",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }

    @PostMapping("/monitor/word")
    @ApiOperation(value = "文档列表",notes="文档列表")
    public AjaxResponse findDocument(){
        log.info("#########查询入参为");
        try{
            List<Document> list = collectService.findDocument();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 ,"文档查询成功", list);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }

    @PostMapping("/timeAndIndex")
    @ApiOperation(value = "各大屏刷新时间",notes="各大屏刷新时间")
    public AjaxResponse timeAndIndex(Integer screenId){
        try{
            HashMap map = collectService.timeAndIndex(screenId);
            if(!CollectionUtils.isEmpty(map)){
                return new AjaxResponse(200,"查询成功",map);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"查询失败");
    }
}

