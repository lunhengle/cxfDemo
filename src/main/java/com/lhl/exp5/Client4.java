package com.lhl.exp5;

import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by lunhengle on 2016/2/18.
 * 使用CXF的JaxWsDynamicClientFactory动态代理工厂
 * 没有验证
 */
public class Client4 {
    public static void main(String args[]){
       /* JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("people.wsdl", classLoader);
        Object person =Thread.currentThread().getContextClassLoader().loadClass("com.acme.Person").newInstance();
        Method m = person.getClass().getMethod("setName", String.class);
        m.invoke(person, "Joe Schmoe");
        client.invoke("addPerson", person);*/
    }
}
