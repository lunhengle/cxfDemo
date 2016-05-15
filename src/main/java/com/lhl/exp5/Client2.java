package com.lhl.exp5;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created by lunhengle on 2016/2/18.
 * 客户端调用javax.xml.ws.Service
 * 没有验证
 */
public class Client2 {
    public static void main(String args[]) {
       /* String endPointAddress = "http://localhost:8080/queryUser";//服务实际地址
        //此处http://charles.com/为命名空间，默认是包名的倒序。IQueryUserService=服务接口名+service
        javax.xml.ws.Service service = javax.xml.ws.Service.create(new QName("http://charles.com/", "IQueryUserService"));
        //IQueryUserPort=服务接口名+Port
        service.addPort(new QName("http://charles.com/", "IQueryUserPort"), javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING, endPointAddress);
        IQueryUser queryService1 = service.getPort(IQueryUser.class);

        System.out.println(queryService1.query(user));*/
    }

}
