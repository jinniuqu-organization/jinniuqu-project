package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.OperationNewService;
import com.kxj.bigscreen.service.OperationService;
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
 * @Date: 2019/12/27 14:43
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="新运行监控大屏")
@RequestMapping("/operation")
public class OperationNewController {

    @Resource
    private OperationNewService operationNewService;

    @PostMapping("/standard")
    @ApiOperation(value = "源数据",notes="源数据")
    public AjaxResponse findStandard(){
        try{
            HashMap list = operationNewService.findStandard();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }
    @PostMapping("/application")
    @ApiOperation(value = "应用",notes="应用")
    public AjaxResponse application(){
        try{
            List<Datamonitor1Application> list = operationNewService.application();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }

    @PostMapping("/transform")
    @ApiOperation(value = "编码映射",notes="编码映射")
    public AjaxResponse transform(){
        try{
            List<Datamonitor2Tansform> list = operationNewService.transform();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }

    @PostMapping("/manage")
    @ApiOperation(value = "编码映射情况",notes="编码映射情况")
    public AjaxResponse manage(@RequestBody Datamonitor2Tansform datamonitor2Tansform){
        try{
            Boolean isEmpty = datamonitor2Tansform == null || StringUtils.isEmpty(datamonitor2Tansform.getTableName());
            if (isEmpty) {
                log.error("###/datamonitor2Tansform 查询入参为空");
                return new AjaxResponse(201,"必要参数为空");
            }
            List<TransformManage> list = operationNewService.manage(datamonitor2Tansform);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }

    @PostMapping("/service")
    @ApiOperation(value = "编码服务对象",notes="编码服务对象")
    public AjaxResponse service(){
        try{

            List<Datamonitor2StandardService> list = operationNewService.service();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }
}
