package com.lhl.exp2;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.phase.Phase;

/**
 * Created by lunhengle on 2016/2/18.
 * 拦截器
 */
public class DeployInterceptorService {
    public static void main(String[] args) throws InterruptedException {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setServiceClass(HelloWorldService.class);
        factoryBean.setAddress("http://localhost:9001/helloWorld");
        //设置ServiceBean对象
        factoryBean.setServiceBean(new HelloWorldService());
        //添加请求和相应的拦截器Phase.RECEIVE只对In有效，Phase.SEND只对Out有效
        factoryBean.getInInterceptors().add(new MessageInterceptor(Phase.RECEIVE));
        factoryBean.getOutInterceptors().add(new MessageInterceptor(Phase.SEND));
        factoryBean.create();
        System.out.println("Server start");
        Thread.sleep(1000*60);
        System.exit(0);
        System.out.println("Service exit");
    }
}
