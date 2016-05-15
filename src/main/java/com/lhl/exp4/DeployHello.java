package com.lhl.exp4;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class DeployHello {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://localhost:8888/hello");
        factoryBean.setServiceClass(HelloImpl.class);
        Server service = factoryBean.create();
        service.start();
    }
}
