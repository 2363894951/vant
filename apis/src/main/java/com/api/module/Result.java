package com.api.module;

import java.util.List;

public class Result <T>{
    private int code;
    private String msg;
    private List<T>  data;

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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private  int count;
    public Result(int code, String msg, List<T> data,int count) {
        this.code=code;
        this.msg=msg;
        this.data=data;
        this.count=count;
    }


}
