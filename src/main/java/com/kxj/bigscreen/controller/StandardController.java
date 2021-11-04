package com.kxj.bigscreen.controller;

import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.StandardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/30 16:14
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags="文档大屏")
public class StandardController {

    @Resource
    private StandardService standardService;

    @Value("${upload.fileDir}")
    private String uploadDir;


    @PostMapping("/standard")
    public AjaxResponse findAmount(){
        try {
            HashMap list = standardService.findAmount();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200 , "查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201 , "查询失败");
    }


    @PostMapping("/title")
    public AjaxResponse findStandard(){
        try{
            List<Standard> list = standardService.findStandard();
            if(!CollectionUtils.isEmpty(list)){
                return new AjaxResponse(200,"数据查询成功",list);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new AjaxResponse(201,"查询失败");
    }

    @PostMapping("/secondTitle")
    public AjaxResponse findSecond(@RequestBody Standard standard){
        log.info("#########查询入参为{}",standard);
        try{
            List<SecondTitle> list = standardService.findTitle(standard);
            if(CollectionUtils.isEmpty(list) || list.get(0)==null){
                return new AjaxResponse(201 , "数据查询为空");
            }
            return new AjaxResponse(200,"数据查询成功",list);
        }catch (Exception e){
            log.info("####数据异常",e);
        }
        return new AjaxResponse(201 , "数据库不存在此信息");
    }


    @PostMapping("/standard/pdf")
    public AjaxResponse findPdf(@RequestBody Standard standard) {

        log.error("###########查询入参为" +standard);
        try {
            standard.setPageStart(standard.getPageStart()-1);
            Map<String , List<StandardMap>> list = standardService.findPdf(standard);
            if (CollectionUtils.isEmpty(list) ) {
                return new AjaxResponse(201, "数据查询为空");
            }
            return new AjaxResponse(200,"数据查询成功",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据库不存在此信息");
    }

    @PostMapping("/standard/search")
    @ApiOperation(value = "模糊查询文档",notes="模糊查询文档")
    public AjaxResponse search(@RequestBody StandardMap standardMap) {

        log.error("###########查询入参为" +standardMap);
        try {

             List<StandardMap> list = standardService.search(standardMap);
            if (CollectionUtils.isEmpty(list) ) {
                return new AjaxResponse(201, "数据查询为空");
            }
            return new AjaxResponse(200,"数据查询成功",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据库不存在此信息");
    }

    @PostMapping("/standard/findAll")
    @ApiOperation(value = "查询全部文档",notes="查询全部文档")
    public AjaxResponse findAll() {


        try {

            List<FirstTitle> list = standardService.findAll();
            if (CollectionUtils.isEmpty(list) ) {
                return new AjaxResponse(201, "数据查询为空");
            }
            return new AjaxResponse(200,"数据查询成功",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据库不存在此信息");
    }

    @PostMapping("/standard/delete")
    @ApiOperation(value = "删除文档")
    public AjaxResponse delete(Integer id) {


        if(id == null){
        log.info("###############必要参数为空");
        return new AjaxResponse(201, "id为空");
        }
        try {

             int a = standardService.delete(id);
            if(a > 0) {
                return new AjaxResponse(200, "数据删除成功",a+"条数据删除成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据删除失败");
    }

    //上传文件

    @PostMapping("/file")
    @ApiOperation(value = "上传文档")
    public AjaxResponse upload( @RequestParam("file") MultipartFile file, Thirt2 thirt ) {


        try {
        Boolean isEmpty = thirt == null || (StringUtils.isEmpty(thirt.getFirstTitle()) || StringUtils.isEmpty(thirt.getSecondTitle()) ||
                StringUtils.isEmpty(thirt.getTitleName()) || StringUtils.isEmpty(thirt.getStatus()));
        if (isEmpty) {
            log.error("###/ 查询入参为空");
            return new AjaxResponse(201 , "必要参数为空");
        }
        if (file == null) {
                return new AjaxResponse(201 , "上传文件为空");
            }
        //获取上传文件名
        String fileName = file.getOriginalFilename();

        String name = fileName.substring(0,fileName.indexOf("."));
        log.info("###############传入文件"+fileName + "########传入参数"+thirt);
        //thirt.setTitleName(name);
        //看文件是否在数据库寻在   如果存在版本号+1   如果不存在默认版本号为1
        Integer a = standardService.select(thirt);
       // log.info("$$$$$$$$$$$$$$$$$$$$"+a);
        if(a == null){
            thirt.setVersion(1);
        }else {
            thirt.setVersion(a+1);
        }
        //文档pdf名称
        String name1= name+"-v"+thirt.getVersion()+".0.pdf";
        log.info("############################"+name1);
          //缓存对象的字节区
            //byte[] b = new byte[is.available()];

            byte [] bytes = file.getBytes();
            //String path = "/Users/freya/Desktop/a/";
            // f:\\a\\

//           File pfile  =new File("F:\\a\\");
            //File pfile = new File("/Users/freya/Desktop/a/");

            File pfile = new File(uploadDir);
            //判断文件夹是否存在
            if(!pfile.exists()){
                //不存在时,创建文件夹
                pfile.mkdirs();
            }

            File file1 = new File(pfile, name1);

            //写入指定文件夹
            OutputStream out = new FileOutputStream(file1);
            out.write(bytes);
            out.close();
            thirt.setStandardUrl("standard/"+name1);

             standardService.insert(thirt);
            return new AjaxResponse("上传成功");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return new AjaxResponse(201, "上传失败");
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新文档")
    public AjaxResponse update( @RequestParam(value = "file" , required = false) MultipartFile file, Thirt3 thirt ) {

        try{
            Thirt2 data = new Thirt2();
            data.setFirstTitle(thirt.getFirstTitle());
            data.setId(thirt.getId());
            data.setSecondTitle(thirt.getSecondTitle());
            data.setStatus(thirt.getStatus());
        if (file != null) {
            //获取上传文件名
            String fileName = file.getOriginalFilename();
            //String name = fileName.substring(0, fileName.indexOf("."));
            log.info("###############传入文件" + fileName + "########传入参数" + thirt);
            byte[] bytes = file.getBytes();
            File pfile  =new File(uploadDir);
            //File pfile = new File("/Users/freya/Desktop/a/");

            //File pfile = new File("/home/web/bigdata-web/standard/a/");
            //判断文件夹是否存在
            if (!pfile.exists()) {
                //不存在时,创建文件夹
                pfile.mkdirs();
            }
            File file1 = new File(pfile, fileName);

            //写入指定文件夹
            OutputStream out = new FileOutputStream(file1);
            out.write(bytes);
            out.close();
            data.setStandardUrl("standard/" + fileName);
        }
            standardService.update(data);
            return new AjaxResponse("数据更新成功");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return new AjaxResponse(201, "数据更新失败");
    }
}
