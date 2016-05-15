package com.lhl.exp2;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 * 定义客户端调用接口.
 */
@WebService(targetNamespace = "http://www.lhl.com/queryUser")
public interface IHelloWorldService {
    String sayHello(@WebParam(name = "name") String name);
}
