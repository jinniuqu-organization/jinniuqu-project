package com.kxj.bigscreen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Datamonitor2StandardService {

  private Integer id;

  @JsonFormat(pattern = "yyyy-MM",timezone="GMT+8")
  private String dateId;
  private String tableType;
  private String departName;
  private String tableNote;
  private long tableId;
  private String updateCycle;
  private String dataRange;
  private long dataCount;



}
