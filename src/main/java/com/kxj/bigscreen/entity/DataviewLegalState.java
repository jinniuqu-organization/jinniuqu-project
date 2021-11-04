package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DataviewLegalState {


    @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
    private String dateId;


    private String street;

    //正常企业
    private Integer normalCnt;

    //异常企业
    private Integer abnormalCnt;

    //吊销企业
    private Integer revokeCnt;

    //注销企业
    private Integer cancelCnt;

    //其他企业
    private Integer otherCnt;

}
