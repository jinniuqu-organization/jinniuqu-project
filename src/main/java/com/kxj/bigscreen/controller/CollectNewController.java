package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.entity.CharMap;
import com.kxj.bigscreen.entity.DataUpdateCondition;
import com.kxj.bigscreen.entity.Document;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectNewService;
import com.kxj.bigscreen.service.CollectService;
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
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:25
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="新汇集监控大屏")
@RequestMapping("/new")
public class CollectNewController {


    @Resource
    private CollectNewService collectNewService;

    @PostMapping("/tableName")
    @ApiOperation(value = "部门表码表",notes="部门表码表")
    public AjaxResponse tableName(){
        //AjaxResponse ajaxResponse = new AjaxResponse();

        try{
            List<TableInfo> list = collectNewService.tableName();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"操作成功",list);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库不存在此信息",null);
    }

    @PostMapping("/chart")
    @ApiOperation(value = "线性图",notes="线性图")
    public AjaxResponse findLine (){
        log.error("##########查询入参为");

        try{
            List<CharMap> list = collectNewService.findLine();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "未查到此信息",null);
    }



    @PostMapping("/getInfo")
    @ApiOperation(value = "数据归集情况",notes="数据归集情况")
    public AjaxResponse findData(){

        try{
            List<DatacollectGeneralInfo> list = collectNewService.getInfo();
            if(!CollectionUtils.isEmpty(list)){
               return new AjaxResponse(200,"数据库查到数据",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库未查到信息",null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新数据",notes="跟新数据")
    public AjaxResponse findUpdate(@RequestBody DatacollectUpdate datacollectUpdate){
        log.info("#########查询入参为"+datacollectUpdate);
        try{
            Boolean isEmpty = datacollectUpdate == null || StringUtils.isEmpty(datacollectUpdate.getTableId());
            if (isEmpty) {
                log.error("###/datacollectUpdate 查询入参为空");
                return new AjaxResponse(201,"必要参数为空");
            }

            List<DataUpdateCondition> list = collectNewService.findUpdate(datacollectUpdate);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200, "更新情况查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库没有此信息",null);
    }

    @PostMapping("/all")
    @ApiOperation(value = "整体采集情况",notes="整体采集情况")
    public AjaxResponse findAmount(){
        try{
            DatacollectGeneralService list = collectNewService.findAmount();
            if(list != null){
                return new AjaxResponse(200, "数据总量查询成功",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }

    @PostMapping("/wordInfo")
    @ApiOperation(value = "文档列表详细信息",notes="文档列表详细信息")
    public AjaxResponse findDocumentInfo(@RequestBody Document document){
        try{

            List<Document> list = collectNewService.findDocumentInfo(document);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 ,"文档查询成功", list);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }
    @PostMapping("/word")
    @ApiOperation(value = "文档列表",notes="文档列表")
    public AjaxResponse findDocument(){
        try{

            List<DatacollectDocument> list = collectNewService.findDocument();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 ,"文档查询成功", list);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }

}

