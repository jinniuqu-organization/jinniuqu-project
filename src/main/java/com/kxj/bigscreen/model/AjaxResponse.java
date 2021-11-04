package com.kxj.bigscreen.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.Serializable;

/**
 * Ajax输出
 *
 * @author yangdx
 * @version 1.0.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AjaxResponse<T> implements Serializable {

    private static final long serialVersionUID = 6489567421676791847L;
    private final static ObjectMapper objectMapper = new ObjectMapper();
    /**
     * 返回状态码
     */
    private int code;

    /**
     * 返回数据
     */
    private String msg;

    /**
     * 返回对象
     */
    private T data;

    /**
     * 构造方法
     */
    public AjaxResponse(){

    }

    public AjaxResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     *如果返回数据直接成功
     */
    public AjaxResponse(T data){
        this.code = 200;
        this.data = data;
        this.msg = "操作成功";
    }

    /**
     * 失败调用
     */
    public AjaxResponse (int code , String msg){
        this.code = 201;
        this.msg = msg;
    }

    /**
     * 成功直接返回数据状态
     */
    public static<T> AjaxResponse<T> ok (T data){
        return new AjaxResponse<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> AjaxResponse<T> error(int code,String msg){
        return new AjaxResponse<T>(code,msg);
    }

    /**
     *转化为json
     */
    public static<T> String toJSON(AjaxResponse<T> ajaxResponse){
        String jsonStr = null;
        try{
            jsonStr = objectMapper.writeValueAsString(ajaxResponse);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return jsonStr;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}