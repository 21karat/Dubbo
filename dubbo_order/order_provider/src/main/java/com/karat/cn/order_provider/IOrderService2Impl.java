package com.karat.cn.order_provider;

import org.springframework.stereotype.Service;

import com.karat.cn.order_api.DoOrderRequest;
import com.karat.cn.order_api.DoOrderResponse;
import com.karat.cn.order_api.IOrderService2;

@Service(value="orderService2")
public class IOrderService2Impl implements IOrderService2{

	public DoOrderResponse doOrder(DoOrderRequest request) {
		// TODO Auto-generated method stub
		System.out.println("2启动过");
		DoOrderResponse response=new DoOrderResponse();
	    response.setCode("2000");
	    response.setMemo("处理成功");
		return response;
	}

}
