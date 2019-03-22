package com.karat.cn.order_provider;

import org.springframework.stereotype.Service;

import com.karat.cn.order_api.IOrderQueryService;

@Service(value = "orderQueryService")
public class IOrderQueryServiceImpl implements IOrderQueryService{

	public String doQuery(String params) {
		// TODO Auto-generated method stub
		System.out.println(params);
		return "实现Query:"+params;
	}

}
