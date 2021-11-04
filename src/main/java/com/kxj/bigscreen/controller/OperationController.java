package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.OperationService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:43
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="运行监控大屏")
public class OperationController {

    @Resource
    private OperationService operationService;

    @PostMapping("/data/standard")
    public AjaxResponse findStandard(){
        try{
            HashMap list = operationService.findStandard();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"操作失败",null);
    }

    @PostMapping("/basis")
    public AjaxResponse findBasis(){
        try{
            List<DataGovernBasis> list = operationService.findBasis();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据库没有此信息",null);
    }

    @PostMapping("/basis/pdf")
    public AjaxResponse findBasisPdf(@RequestBody DataGovernBasis dataGovernBasis ) {

        log.error("###########查询入参为" + dataGovernBasis);
        try {
            List<DataGovernBasis> list = operationService.findBasisPdf(dataGovernBasis);
            if (!CollectionUtils.isEmpty(list)) {
                return new AjaxResponse(200, "查到此url地址", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据库没有此信息", null);
    }

    @PostMapping("/server")
    public AjaxResponse findServer(){
        try{
            List<DataGovernServer> list = operationService.findServer();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "操作成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "查询失败",null);
    }

    @PostMapping("/standard/server")
    public AjaxResponse findCodeServer(){
        try{
            List<CodeServer> list = operationService.findCodeServer();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查询成功", list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "未查到结果",null);
    }

    @PostMapping("/standard/top")
    public AjaxResponse findStandardTop(){
        try{
            List<StandardTop> list = operationService.findStandardTop();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查到数据",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"查询失败",null);
    }


    @PostMapping("/standard/code")
    public AjaxResponse findCodeTop(){
        try{
            List<CodeTop> list = operationService.findCodeTop();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查询数据成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "查询数据失败",null);
    }

    @PostMapping("/standard/word")
    public AjaxResponse findWord(){
        try{
            List<CodeStandard> list = operationService.findWord();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据查询失败",null);
    }
}
