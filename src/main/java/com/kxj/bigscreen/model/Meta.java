package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 14:38
 * @Version 1.0
 */
@Data
public class Meta implements Serializable {

    private Integer id;

    /**元信息*/
    private String metaType;

    /**中文名称*/
    private String cnName;

    /**英文名称*/
    private String enName;

    /**内部标识符*/
    private String internalIdentifier;

    /**中文全拼*/
    private String cnTranslate;

    /**汉语拼音缩写*/
    private String cnTranslateAbbr;

    /**说明*/
    private String illustrate;

    /**表示词*/
    private String denote;

    /**数据类型*/
    private String dataType;

    /**数据格式*/
    private String dataFormat;

    /**值域*/
    private String domain;

    /**提交结构*/
    private String submitInstitutions;

   private String updateTime;
}
