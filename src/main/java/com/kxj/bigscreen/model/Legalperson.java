package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/10/18 15:57
 * @Version 1.0
 */
/**法人库*/
@Data
public class Legalperson implements Serializable {

    @Id
    private String legalpersonId;

    private String department;

    /**统一社会信用代码*/
    private String unifyCode;



    /**组织机构代码*/
    private String orgCode;



    /**工商注册号*/
    private String regCode;



    /**企业姓名*/
    private String orgName;



    /**企业类型*/
    private String orgType;



    /**企业法人姓名*/
    private String legalperson;



    /**经营范围*/
    private String bussinessScope;



    /**经营类别*/
    private String jylb;


    /**成立日期*/
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String clDate;



    /**存续状态*/
    private String epState;



    /**营业（有效）结束日期*/
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String valiDate;



    /**注册地址*/
    private String regAddress;



    /**联系电话*/
    private String telephone;



    /**历史版本*/
    private Integer dataVersion;

    /**数据更新时间*/
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String updateTime;


}
