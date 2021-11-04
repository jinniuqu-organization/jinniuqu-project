package com.kxj.bigscreen.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;

import com.kxj.bigscreen.service.LabelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
 * @Date: 2019/12/26 15:25
 * @Version 1.0
 */
@RestController
@Slf4j
@Api(tags = "标签页大屏")
@RequestMapping("/label")
public class LabelController {


    @Resource
    private LabelService labelService;


    @ApiOperation(value = "工作地址", notes = "工作地址")
    @PostMapping("/gz")
    public AjaxResponse gz(@RequestBody DataservPersonGzdz data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data.getIdcard());
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            DataservPersonGzdz list = labelService.gzdz(data);
            if (list != null ) {
                return new AjaxResponse(200, "工作地址查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }


    @ApiOperation(value = "户籍地址", notes = "户籍地址")
    @PostMapping("/hj")
    public AjaxResponse hj(@RequestBody DataservPersonHjdz data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data.getIdcard());

        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            DataservPersonHjdz list = labelService.hjdz(data);
            if (list != null) {
                return new AjaxResponse(200, "户籍地址查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "现住地址", notes = "现住地址")
    @PostMapping("/jz")
    public AjaxResponse jz(@RequestBody DataservPersonJzdz data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }

        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            log.info("##################"+data);
            DataservPersonJzdz list = labelService.jzdz(data);
            if (list != null) {
                return new AjaxResponse(200, "现住地址查询成功", list);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "个人标签详细信息+关系标签+关系标签详细信息", notes = "个人标签详细信息+关系标签+关系标签详细信息")
    @PostMapping("/la")
    public AjaxResponse label(@RequestBody DataservPersonalLabel data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            DataservPersonalLabel list = labelService.label(data);
            if (list != null) {
                return new AjaxResponse(200, "个人标签详细信息查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "关系链信息", notes = "关系链信息")
    @PostMapping("/chain")
    public AjaxResponse chain(@RequestBody DataservRelationChain data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else  if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            List<DataservRelationChain> list = labelService.chain(data);
            if (list != null) {
                return new AjaxResponse(200, "关系链信息查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "关系标签信息", notes = "关系标签信息")
    @PostMapping("/relation")
    public AjaxResponse relation(@RequestBody DataservRelationLabel data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            DataservRelationLabel list = labelService.rela(data);
            if (list != null) {
                return new AjaxResponse(200, "关系标签信息查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "关系标签表格信息", notes = "关系标签表格信息")
    @PostMapping("/relationExcel")
    public AjaxResponse relationExcel(@RequestBody DataservPersonalLabel data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            List<DataservPersonalLabel> list = labelService.chainLabel(data);
            if (!CollectionUtils.isEmpty(list)) {
                return new AjaxResponse(200, "关系标签表格信息查询成功", list);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "关系标签表格详细信息", notes = "关系标签表格详细信息")
    @PostMapping("/relationDetail")
    public AjaxResponse relationDetail(@RequestBody DataservPersonalLabel data) {
        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        if (data.getPageNum() == null || data.getPageNum() == 0) {
            data.setPageNum(1);
        }
        log.info("##################" + data.getPageNum());
        PageHelper.startPage(data.getPageNum(), 10);
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else  if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            List<DataservPersonalLabel> list = labelService.chainLabel1(data);
            PageInfo<DataservPersonalLabel> pageInfo = new PageInfo<>(list);
            return new AjaxResponse(200, "关系标签表格详细信息查询成功", pageInfo);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "个性化新闻", notes = "个性化新闻")
    @PostMapping("/news")
    public AjaxResponse news(@RequestBody DataservNewsRecommend data) {

        if (StringUtils.isEmpty(data.getIdcard())) {
            return new AjaxResponse(201, "必要参数为空", null);
        }
        log.info("##########查询入参为" + data);
        try {
            if (data.getIdcard().length() == 15) {
                data.setIdcard15(data.getIdcard());
                data.setIdcard(null);
            }
            else if (data.getIdcard().length() == 18) {
                data.setIdcard(data.getIdcard());
            } else {
                return new AjaxResponse(201, "参数格式不合格，参数长度为15或18位");
            }
            List<DataservNewsRecommend> list = labelService.news(data);
            if (!CollectionUtils.isEmpty(list)) {
                return new AjaxResponse(200, "关系标签信息查询成功", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

    @ApiOperation(value = "健康码", notes = "健康码")
    @PostMapping("/auth")
    public AjaxResponse anth(@RequestBody String idCard) {

        try {
            AuthReault data = labelService.auth(idCard);
            if (data != null) {
                return new AjaxResponse(200, "健康码查询成功", data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxResponse(201, "数据不存在", null);
    }

}

