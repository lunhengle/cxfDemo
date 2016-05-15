package com.lhl.exp2;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;

/**
 * Created by lunhengle on 2016/2/18.
 * 自定义拦截器
 */
public class MessageInterceptor extends AbstractPhaseInterceptor<Message> {
    //至少一个带参数的构造函数
    public MessageInterceptor(String phase) {
        super(phase);
    }

    public void handleMessage(Message message) throws Fault {
        System.out.println("######handleMessage######");
        System.out.println(message);
        if (null != message.getDestination()) {
            System.out.println(message.getId() + "#" + message.getDestination().getMessageObserver());
        }
        if (null != message.getExchange()) {
            System.out.println(message.getExchange().getInMessage() + "#" + message.getExchange().getInFaultMessage());
            System.out.println(message.getExchange().getOutMessage() + "#" + message.getExchange().getOutFaultMessage());
        }
    }
}
