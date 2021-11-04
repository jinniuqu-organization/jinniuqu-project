package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.model.Person;
import com.kxj.bigscreen.model.PersonStatus;
import com.kxj.bigscreen.service.PersonService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/9/10 12:05
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/person")
@Api(tags="人口数据大屏")
public class PersonController {

    @Resource
    private PersonService personService;

    /**
     * 通过身份证查询用户信息
     * @param person
     * @return
     */
    @PostMapping("/findAll" )
    public AjaxResponse FindAll(@RequestBody Person person){
        AjaxResponse ajaxResponse = new AjaxResponse();
        log.info("#########查询入参为{}", person);
        try{
            Boolean isEmpty = person == null || (StringUtils.isEmpty(person.getIdCard()));
            if (isEmpty) {
                log.error("###/person 身份证信息查询入参为空");
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("必要参数为空");
                return ajaxResponse;
            }
            Map<String ,List<Person>> list = personService.findAll(person);
            if(CollectionUtils.isEmpty(list)) {
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("数据库不存在此信息");
                return ajaxResponse;
            }
            ajaxResponse.setCode(200);
            ajaxResponse.setMsg("查询人口库数据成功");
            ajaxResponse.setData(list);
            return ajaxResponse;
        } catch (Exception e){
            log.error("数据异常{}",e.getMessage());
        }
        ajaxResponse.setCode(201);
        ajaxResponse.setMsg("数据库不存在此信息");
        return ajaxResponse;
    }




    /**
     * 查询历史版本
     * @param person
     * @return
     */
    @PostMapping("/history")
    public AjaxResponse findVersionAll(@RequestBody Person person){
        AjaxResponse ajaxResponse = new AjaxResponse();
        log.info("#########查询入参为"+ person);
        try{
            Boolean isEmpty = person == null || (StringUtils.isEmpty(person.getIdCard()));
            if (isEmpty) {
                log.error("###/person 身份证号码查询入参为空");
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("必要参数为空");
                return ajaxResponse;
            }
            if(StringUtils.isEmpty(person.getDataVersion())){
                person.setDataVersion(1);
            }
            List list = personService.findVersionAll(person);
            if(CollectionUtils.isEmpty(list)) {
                ajaxResponse.setCode(201);
                ajaxResponse.setMsg("数据库不存在此信息");
                return ajaxResponse;
            }
            ajaxResponse.setCode(200);
            ajaxResponse.setMsg("查询人口库数据历史版本成功");
            ajaxResponse.setData(list);
            return ajaxResponse;
        } catch (Exception e){
            log.error("数据异常{}",e.getMessage());
        }
        ajaxResponse.setCode(201);
        ajaxResponse.setMsg("数据库不存在此信息");
        return ajaxResponse;
    }


}
