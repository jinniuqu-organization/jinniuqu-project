package com.kxj.bigscreen.entity;

import lombok.Data;

@Data
public class Document {

    private Integer tableId;
    private String tableNote;
    private String column;
    private String columnNote;
    private String codeState;
}
