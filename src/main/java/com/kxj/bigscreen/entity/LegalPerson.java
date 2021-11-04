package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class LegalPerson {

    private Integer pageNum;

    private String uniScid;

    private String entName;

    private String regAddress;

    private String legalRepresent;

    private String tel;
//机构类型
    private String entType;

    private String entState;
    //注册资金
    private Integer registeredCapital;
    //type对照：1：统一社会信用代码 2：机构名称 3：法定代表人 4：注册资金
    private String type;
    //查询参数parameter
    private String parameter;
}
