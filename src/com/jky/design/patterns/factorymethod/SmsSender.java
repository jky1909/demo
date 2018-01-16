package com.jky.design.patterns.factorymethod;

/**
 * @author jky
 * @Create Date 2018-01-16
 * 短信发送实现类
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
