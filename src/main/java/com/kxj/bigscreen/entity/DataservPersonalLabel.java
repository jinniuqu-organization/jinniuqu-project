package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="", description="人口标签")
public class DataservPersonalLabel {

    private Integer pageNum;
    private String relationLabel;
    private String idcard;
    private String idcard15;
    //姓名
    private String name;
    private String sex;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String birthdate;

    private String telephone;
    //出生地
    private String birthAddr;
    //籍贯
    private String nativePlace;
    //民族
    private String ethnicGroup;
    //国籍
    private String nationality;
    //最高学历
    private String edulevel;
    //政治面貌
    private String polity;
    //婚姻状况
    private String marriageType;
    //单位名称
    private String companyname;
    //家庭住址
    private String presentAddress;
    //户籍登记地址
    private String rprAddress;
    //户口类别
    private String rprtype;
    //户籍状态
    private String rprstatus;
    //与户主关系
    private String hostrelation;
    //残疾人证号
    private String dcId;
    //残疾等级
    private String dLevel;
    //残疾分类
    private String dKind;
    //死亡日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private String dieDate;
    //人员照片
    private String facePic;
    //是否人户同在
    private String ifHoldpeople;
    //是否老年人
    private String ifOld;
    //户籍人口标识
    private String ifRegiter;
    //流动人口标示
    private String ifFloat;
    //是否已婚
    private String ifMarriage;
    //死亡标示
    private String dieFlag;
    //是否民政救助
    private String ifRecipient;
    //残疾人标示
    private String ifDisability;
    //实有人口标示
    private String ifActual;
    //是否技防
    private String ifJf;
    //是否西城家园
    private String ifXcjy;

    //是否意愿接种
    private String ifWishVaccine;

    //是否一接种
    private String ifHaveVaccine;








}
