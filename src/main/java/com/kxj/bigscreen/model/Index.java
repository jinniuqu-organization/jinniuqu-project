package com.kxj.bigscreen.model;

import lombok.Data;

/**
 * @Author: wangxiaogang
 * @Date: 2020/3/25 13:45
 * @Version 1.0
 */
@Data
public class Index {

    /**大屏id  */
    private Integer screenId;

    /**指标解释id*/
    private Integer indexId;

    /**指标名称*/
    private String indexName;

    /**指标解释*/
    private String indexExplain;

}
