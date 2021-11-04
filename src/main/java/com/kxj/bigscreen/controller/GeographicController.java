package com.kxj.bigscreen.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInfo;
import com.kxj.bigscreen.entity.GeographicInfo;
import com.kxj.bigscreen.entity.GeographicSummary;
import org.springframework.util.CollectionUtils;
import com.kxj.bigscreen.entity.Geographic;
import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.service.GeographicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Acthor Tao.Lee @date 2021/10/18 14:49
 * @Description
 */
@RestController
@Slf4j
@Api(tags = "地理信息查询")
@RequestMapping("/geographic")
public class GeographicController {

    @Resource
    private GeographicService geographicService;

    @ApiOperation(value = "地理信息表名", notes = "地理信息表名")
    @GetMapping("/tablename")
    public AjaxResponse getGeographicTable(){
        try{
            List<Geographic> list=geographicService.getGeographicName();
            if(!CollectionUtils.isEmpty(list)) {
                PageInfo<Geographic> pageInfo = new PageInfo<>(list);
                return new AjaxResponse(200, "地理信息表名", pageInfo);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "地理信息表字段", notes = "地理信息表字段")
    @PostMapping("/tableinfo")
    public AjaxResponse getGeographicInfo(@RequestBody String str){
        try{
            Integer id = Integer.parseInt(JSON.parseObject(str).get("id").toString());
            log.info("##########查询入参为" + id);
            GeographicInfo geographicInfo=geographicService.getGeographicInfo(id);
            log.info("=========="+geographicInfo);
            //以下代码均是为了实现前端提的需求而写，不断的new
            Map map1 = new HashMap<String, String>();
            map1.put("table",geographicInfo.getTable());
            map1.put("table_name",geographicInfo.getTableName());
            Map map3 = new HashMap<String, String>();
            map3.put("table",geographicInfo.getField1());
            map3.put("table_name",geographicInfo.getField1Name());
            Map map5 = new HashMap<String, String>();
            map5.put("table",geographicInfo.getField2());
            map5.put("table_name",geographicInfo.getField2Name());
            Map map7 = new HashMap<String, String>();
            map7.put("table",geographicInfo.getField3());
            map7.put("table_name",geographicInfo.getField3Name());
            Map map9 = new HashMap<String, String>();
            map9.put("table",geographicInfo.getField4());
            map9.put("table_name",geographicInfo.getField4Name());
            Map map11 = new HashMap<String, String>();
            map11.put("table",geographicInfo.getField5());
            map11.put("table_name",geographicInfo.getField5Name());
            Map map13 = new HashMap<String, String>();
            map13.put("table",geographicInfo.getField6());
            map13.put("table_name",geographicInfo.getField6Name());
            Map map15 = new HashMap<String, String>();
            map15.put("table",geographicInfo.getField7());
            map15.put("table_name",geographicInfo.getField7Name());
            Map map17 = new HashMap<String, String>();
            map17.put("table",geographicInfo.getField8());
            map17.put("table_name",geographicInfo.getField8Name());

            List list = new ArrayList();
            list.add(map1);
            list.add(map3);
            list.add(map5);
            list.add(map7);
            if(geographicInfo.getField4()!=null){
            list.add(map9);}
            if(geographicInfo.getField5()!=null){
            list.add(map11);}
            if(geographicInfo.getField6()!=null){
            list.add(map13);}
            if(geographicInfo.getField7()!=null){
            list.add(map15);}
            if(geographicInfo.getField8()!=null){
            list.add(map17);}
            List list1=new ArrayList();
            list1.add(geographicInfo.getId());
            HashMap<String,List<String>> geographicInfoWeb =new HashMap<String, List<String>>();
            geographicInfoWeb.put("id",list1);
            geographicInfoWeb.put("list",list);
            log.info("最终结果为###"+geographicInfoWeb);
            if(null!=geographicInfoWeb){
                return new AjaxResponse(200 , "api接口详情查询成功",geographicInfoWeb);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return new AjaxResponse(201, "数据不存在", null);
    }

    //废弃
    @ApiOperation(value = "地理信息h汇总表", notes = "地理信息汇总表")
    @PostMapping("/tablesummary")
    public AjaxResponse getGeographicSummary(@RequestBody String str){
        try {
            Integer searchId = Integer.parseInt(JSON.parseObject(str).get("id").toString());
            log.info("##########查询入参为" + searchId);
            List<GeographicSummary> list=geographicService.getGeographicSummary(searchId);
            if(!CollectionUtils.isEmpty(list)) {
                PageInfo<GeographicSummary> pageInfo = new PageInfo<>(list);
                return new AjaxResponse(200, "地理信息表名", pageInfo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "地理信息汇总表加名称", notes = "地理信息汇总表加名称")
    @PostMapping("/tablesummaryname")
    public AjaxResponse getGeographicSummaryName(@RequestBody String str){

        Integer pageNum = Integer.parseInt(JSON.parseObject(str).get("pageNum").toString());
        if (pageNum == null || pageNum == 0) {
            pageNum=1;
        }
        log.info("##################" + pageNum);
        PageHelper.startPage(pageNum, 10);
        try {
            Integer searchId = Integer.parseInt(JSON.parseObject(str).get("id").toString());
            String name =JSON.parseObject(str).get("name").toString();
            log.info("##########查询入参为" + searchId+" "+name);
            if(name == "" ){
                List<GeographicSummary> list=geographicService.getGeographicSummary(searchId);
                if(!CollectionUtils.isEmpty(list)) {
                    PageInfo<GeographicSummary> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "地理信息表名", pageInfo);
                }
            }else if(name != "" ) {
                List<GeographicSummary> list = geographicService.getGeographicSummaryName(searchId, name);
                if (!CollectionUtils.isEmpty(list)) {
                    PageInfo<GeographicSummary> pageInfo = new PageInfo<>(list);
                    return new AjaxResponse(200, "地理信息表名", pageInfo);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }
}

