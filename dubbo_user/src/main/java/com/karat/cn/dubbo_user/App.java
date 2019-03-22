package com.karat.cn.dubbo_user;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.karat.cn.order_api.DoOrderRequest;
import com.karat.cn.order_api.DoOrderResponse;
import com.karat.cn.order_api.IOrderQueryService;
import com.karat.cn.order_api.IOrderService;
import com.karat.cn.order_api.IOrderService2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException, ExecutionException
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("order-consumer.xml");

        /*//用户下单过程
        IOrderService services=(IOrderService)context.getBean("orderService");

        DoOrderRequest request=new DoOrderRequest();
        request.setName("Hello world!");
        DoOrderResponse response=services.doOrder(request);
        System.out.println(response);
        
        IOrderQueryService orderQueryService=(IOrderQueryService)context.getBean("orderQueryService");
        System.out.println(orderQueryService.doQuery("KKK"));
      

        
        IOrderService2 services2=(IOrderService2)context.getBean("orderService2");

        DoOrderRequest request2=new DoOrderRequest();
        request.setName("AAAA");
        DoOrderResponse response2=services2.doOrder(request2);
        System.out.println(response2);
        //Order.doOrder();
        System.in.read();*/
    	
    	IOrderService2 services=(IOrderService2)context.getBean("orderService2");

    	//异步测试
        DoOrderRequest request=new DoOrderRequest();
        request.setName("Hello world!");
        services.doOrder(request);
        Future<DoOrderResponse> reFuture=RpcContext.getContext().getFuture();
        System.out.println("ABVC");
        DoOrderResponse response=reFuture.get();//阻塞那请求数据
        System.out.println(response);
        System.in.read();
    }
}
