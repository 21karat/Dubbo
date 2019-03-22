package com.karat.cn.order_api;

import java.io.Serializable;

/**
 * 请求
 * @author 开发
 *
 */
public class DoOrderRequest implements Serializable{

    private static final long serialVersionUID = 4632876501724851634L;

    private String name;//请求参数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
