package com.kxj.bigscreen.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 13:52
 * @Version 1.0
 */
@Data
public class ProblemBoard implements Serializable {

    private String type;
    private List<BoardAmount> boardAmount;
    private String total;

}
