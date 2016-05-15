package com.lhl.exp4;

import org.codehaus.jettison.json.JSONObject;

import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 * 客户端
 */
@WebService
public interface IHello {
    String sayHello();

    String sayJson();

    String sayXml();
}
