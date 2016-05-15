package com.lhl.exp3;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class DeployComplexUserService {
    public static void main(String[] args) throws InterruptedException {
        String address = "http://localhost:9000/complexUser";
        DeployUtils.deplotService(address, new ComplexUserService());
        System.out.println("service ready.....");
        Thread.sleep(1000 * 60*5);
        System.out.println("service exiting");
        System.exit(0);

    }
}
