package com.lhl.exp5;

import javax.xml.ws.Endpoint;

/**
 * Created by lunhengle on 2016/2/18.
 * 服务端创建方式一 jax-ws
 * 没有验证
 */
public class Service1 {
    public static void main(String[] args) {
        String url = "http://localhost:8080/queryUser";
        Endpoint.publish(url, new QueryUserImpl());
    }
}
