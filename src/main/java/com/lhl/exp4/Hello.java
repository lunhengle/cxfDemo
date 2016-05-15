package com.lhl.exp4;

import org.codehaus.jettison.json.JSONObject;

import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 * 服务端
 */
@WebService
public interface Hello {
    String sayHello();

    JSONObject sayJson();

    String sayXml();

}
