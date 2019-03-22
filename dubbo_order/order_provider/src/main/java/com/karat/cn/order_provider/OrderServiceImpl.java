package com.karat.cn.order_provider;

import org.springframework.stereotype.Service;

import com.karat.cn.order_api.DoOrderRequest;
import com.karat.cn.order_api.DoOrderResponse;
import com.karat.cn.order_api.IOrderService;
/**
 * 定义接口实现类
 * @author 开发
 *
 */
@Service(value = "orderService")
public class OrderServiceImpl implements IOrderService{

    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过："+request);
        DoOrderResponse response=new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
