package com.lhl.exp4;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class HelloClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IHello.class);
        factoryBean.setAddress("http://localhost:8888/hello");
        IHello hello = (IHello) factoryBean.create();
        String str = hello.sayHello();
        System.out.println(str);
        String xml = hello.sayXml();
        System.out.println(xml);
        String json = hello.sayJson();
        System.out.println(json);
    }
}
