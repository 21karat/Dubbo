package com.karat.cn.order_api;

import java.io.Serializable;

/**
 * 返回
 * @author 开发
 *
 */
public class DoOrderResponse implements Serializable{

    private static final long serialVersionUID = 3938659532219361525L;
    
    private Object data;//返回数据

    private String code;//状态码

    private String memo;//状态信息

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
