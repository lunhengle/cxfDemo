package com.lhl.exp2;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 * 创建 HelloWorld 服务
 */
@WebService
public class HelloWorldService {
    public String sayHello(@WebParam(name = "name") String name) {
        return name + " say;Hello World!";
    }
}
