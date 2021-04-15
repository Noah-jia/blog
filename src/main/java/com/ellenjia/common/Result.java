package com.ellenjia.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code; //200是正常，非200是异常数据
    private  String msg;
    private Object data;

    public static Result success(Object data){
          return success(200,"操作成功",data);
    }

    public static Result success(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    public static Result error(String msg){
    return error (msg,null);
    }
    public static Result error(String msg,Object data){
       return error(400,msg,data);
    }
    public static Result error(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
