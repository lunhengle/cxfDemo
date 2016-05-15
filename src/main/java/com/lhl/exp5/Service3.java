package com.lhl.exp5;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by lunhengle on 2016/2/18.
 * cxf simle FrontEnd 方式
 * 该方式无需在类中指定相关协议，也就是说不需要在类中指定相关webservice注解，一个普通类就行
 * 没有验证
 */
public class Service3 {
    public static void main(String[] args) {
        ServerFactoryBean factoryBean = new ServerFactoryBean();
        //设置服务接口类
        factoryBean.setServiceBean(IQueryUser.class);
        factoryBean.setAddress("http://localhost:8080/queryUser");
        //设置服务的实现接口类
        factoryBean.setServiceBean(QueryUserImpl.class);
        factoryBean.create();
    }
}
