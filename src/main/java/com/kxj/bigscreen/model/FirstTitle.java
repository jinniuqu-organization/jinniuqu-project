package com.kxj.bigscreen.model;

import lombok.Data;

import java.util.List;

@Data
public class FirstTitle {


    private String titleName;
    private List<Second> children;

}
