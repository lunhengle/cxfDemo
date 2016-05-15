package com.lhl.exp3;

import javax.xml.ws.Endpoint;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class DeployUtils {
    public static void deplotService(String address, Object service) {
        System.out.println("Service start ......");
        Endpoint.publish(address, service);
    }
}
