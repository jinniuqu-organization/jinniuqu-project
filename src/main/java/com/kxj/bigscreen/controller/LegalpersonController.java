package com.kxj.bigscreen.controller;



import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.LegalpersonService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: wangxiaogang
 * @Date: 2019/11/18 17:08
 * @Version 1.0
 */
@Slf4j
@RestController
@Api(tags="法人数据")
@RequestMapping("/legalperson")
public class LegalpersonController {


    @Autowired
    private LegalpersonService legalpersonService;

    /**
     * 法人库数据查询
     * @param legalperson
     * @return
     */
    @PostMapping("/findAll" )
    public AjaxResponse findAll(@RequestBody Legalperson legalperson){
        AjaxResponse ajaxResponse = new AjaxResponse();
        log.info("###/legalperson 查询入参为：{}" , legalperson);
        try{
            Boolean isEmpty = legalperson == null || (StringUtils.isEmpty(legalperson.getOrgCode()) && StringUtils.isEmpty(legalperson.getOrgName()) &&
                    StringUtils.isEmpty(legalperson.getRegCode()) && StringUtils.isEmpty(legalperson.getUnifyCode()));
            if (isEmpty) {
                log.error("###/legalperson 查询入参为空");
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("必要参数为空");
                return ajaxResponse;
            }
            Map<String , List<Legalperson>> list = legalpersonService.findAll(legalperson);
            if(CollectionUtils.isEmpty(list)) {
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("数据库不存在此信息");
                return ajaxResponse;
            }
            ajaxResponse.setCode(200);
            ajaxResponse.setMsg("法人库信息查询成功");
            ajaxResponse.setData(list);
            return ajaxResponse;
        } catch (Exception e){
           log.error("数据信息异常", e.getMessage());
        }
        ajaxResponse.setCode(201);
        ajaxResponse.setMsg("数据信息异常");
        return ajaxResponse;
    }

    /**
     * 查询法人库历史版本
     * @param legalperson
     * @return
     */
    @PostMapping("/history")
    public AjaxResponse findVersionAll(@RequestBody Legalperson legalperson){
        AjaxResponse ajaxResponse = new AjaxResponse();
        log.info("#########查询入参为{}", legalperson);
        try{
            Boolean isEmpty = legalperson == null || (StringUtils.isEmpty(legalperson.getOrgCode()) && StringUtils.isEmpty(legalperson.getOrgName()) &&
                    StringUtils.isEmpty(legalperson.getRegCode()) && StringUtils.isEmpty(legalperson.getUnifyCode()));
            if (isEmpty) {
                log.error("###/legalperson 法人库查询入参为空");
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("必要参数为空");
                return ajaxResponse;
            }

            List list = legalpersonService.findVersion(legalperson);
            if(CollectionUtils.isEmpty(list)) {
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("数据库不存在此信息");
                ajaxResponse.setData(null);
                return ajaxResponse;
            }
            ajaxResponse.setCode(200);
            ajaxResponse.setMsg("查询法人库数据历史版本成功");
            ajaxResponse.setData(list);
            return ajaxResponse;
        } catch (Exception e){
            log.error("数据信息异常", e.getMessage());
        }
        ajaxResponse.setCode(201);
        ajaxResponse.setMsg("数据库不存在此信息");
        return ajaxResponse;
    }



}
