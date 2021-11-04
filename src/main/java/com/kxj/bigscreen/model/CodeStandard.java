package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 11:51
 * @Version 1.0
 */
@Data
public class CodeStandard implements Serializable {

    private Integer id;
    private String type;
    private String updateTime;
}
