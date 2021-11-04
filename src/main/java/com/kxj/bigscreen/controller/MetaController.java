package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.model.AjaxResponse;
import com.kxj.bigscreen.model.Meta;
import com.kxj.bigscreen.service.PersonService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2020/1/9 11:30
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="元数据大屏")
public class MetaController {

    @Resource
    private PersonService personService;

    @PostMapping("/meta")
    public AjaxResponse findMeta(@RequestBody Meta meta){
        log.error("#########查询入参为"+meta);
        try{
            List<Meta> list = personService.findMeta(meta);
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "元数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


    @PostMapping("meta/detail")
    public AjaxResponse findMetaDetail(@RequestBody Meta meta){
        log.error("#########查询入参为"+meta);
        try{
            Meta list = personService.findMetaDetail(meta);
            if(list!=null){
                return new AjaxResponse(200 , "元数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"数据不存在",null);
    }


}
