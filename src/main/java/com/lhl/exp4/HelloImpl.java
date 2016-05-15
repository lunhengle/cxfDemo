package com.lhl.exp4;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 * 服务端
 */
@WebService
public class HelloImpl {
    public String sayHello() {
        System.out.println("web service str 调用成功!");
        return "hello world";
    }

    public String sayJson() {
        System.out.println("web service json 调用成功!");
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", "lunhengle");
            jsonObject.put("age", "26");
            jsonObject.put("email", "lunhengle@outlook.com");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    public String sayXml() {
        System.out.println("web service xml 调用成功!");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<?xml version='1.0' encoding='UTF-8'?>");
        stringBuffer.append("<reslut>");
        stringBuffer.append("<name>lunhengle</name>");
        stringBuffer.append("<age>26</age>");
        stringBuffer.append("<email>lunhengle@outlook.com</email>");
        stringBuffer.append("</result>");
        return stringBuffer.toString();
    }
}
