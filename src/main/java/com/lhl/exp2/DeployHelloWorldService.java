package com.lhl.exp2;

import javax.xml.ws.Endpoint;

/**
 * Created by lunhengle on 2016/2/18.
 * 服务端调用.
 */
public class DeployHelloWorldService {
    /**
     * 发布服务.
     */
    public static void deployService() {
        System.out.println("Server start ........");
        HelloWorldService service = new HelloWorldService();
        String address = "http://localhost:9001/helloWorld";
        Endpoint.publish(address, service);
    }

    /**
     * 服务发布.
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        deployService();
        System.out.println("service ready.....");
        Thread.sleep(1000 * 60);
        System.out.println("service exiting");
        System.exit(0);
    }
}
