package com.kxj.bigscreen.entity;


import lombok.Data;

import java.util.Date;

@Data
public class ApiInfo {

  private long apiId;
  private String apiName;
  private String apiState;
  private String apiMethod;
  private String apiExplain;
  private Integer apiCount;
  private String apiObject;



}
