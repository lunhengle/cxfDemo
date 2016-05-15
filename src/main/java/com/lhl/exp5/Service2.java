package com.lhl.exp5;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by lunhengle on 2016/2/18.
 * cxf 方式
 * 没有验证
 *
 */
public class Service2 {
    public static void main(String args) {
        String url = "http://localhost:8080/queryUser";
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress(url);
        factoryBean.setServiceClass(IQueryUser.class);
        factoryBean.setServiceBean(new QueryUserImpl());
        factoryBean.create();
    }
}
