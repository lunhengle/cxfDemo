package com.lhl.exp2;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by lunhengle on 2016/2/18.
 * 客户端调用.
 */
public class HelloWorldServiceClient {
    /**
     * 客户端调用服务.
     *
     * @param args
     */
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IHelloWorldService.class);
        factoryBean.setAddress("http://127.0.0.1:9001/helloWorld");
        //添加日志拦截器
        //输出response回应信息
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        //输出 request 请求信息
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        IHelloWorldService service = (IHelloWorldService) factoryBean.create();
        System.out.println("[result]" + service.sayHello("lunhengle"));
    }
}
