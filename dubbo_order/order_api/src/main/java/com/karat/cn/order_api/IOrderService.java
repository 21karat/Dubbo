package com.karat.cn.order_api;

/**
 * 定义一个接口
 * @author 开发
 *
 */
public interface IOrderService {

    /*
     * 下单操作
     */
    DoOrderResponse doOrder(DoOrderRequest request);

    
}
