package com.kxj.bigscreen.controller;


import com.kxj.bigscreen.entity.Department;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.model.CharMap;
import com.kxj.bigscreen.model.CollectCondition;
import com.kxj.bigscreen.model.DataCollect;
import com.kxj.bigscreen.service.CollectNewService;
import com.kxj.bigscreen.service.GovernService;
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
 * @Date: 2019/12/26 15:25
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="新治理大屏")
@RequestMapping("/govern")
public class GovernController {


    @Resource
    private GovernService governService;

    @PostMapping("/tableName")
    @ApiOperation(value = "部门表码表",notes="部门表码表")
    public AjaxResponse tableName(){
        //AjaxResponse ajaxResponse = new AjaxResponse();

        try{
            List<Department> list = governService.tableName();
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
            List<CharMap> list = governService.findLine();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "未查到此信息",null);
    }



    @PostMapping("/getInfo")
    @ApiOperation(value = "部门详细情况",notes="数据详细情况")
    public AjaxResponse findData(@RequestBody CollectCondition collectCondition){

        try{
            Boolean isEmpty = collectCondition == null || StringUtils.isEmpty(collectCondition.getDepartmentId());
            if (isEmpty) {
                log.error("###/collectCondition 查询入参为空");
                return new AjaxResponse(201,"必要参数为空");
            }
            List<CollectCondition> list = governService.getInfo(collectCondition);
            if(!CollectionUtils.isEmpty(list)){
               return new AjaxResponse(200,"数据库查到数据",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据库未查到信息",null);
    }



    @PostMapping("/all")
    @ApiOperation(value = "整体采集情况",notes="整体采集情况")
    public AjaxResponse findAmount(){
        try{
            DataCollect list = governService.findAmount();
            if(list != null){
                return new AjaxResponse(200, "数据总量查询成功",list);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "数据库查询失败" , null);
    }



}

