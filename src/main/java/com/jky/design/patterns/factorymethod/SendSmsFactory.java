package com.jky.design.patterns.factorymethod;

/**
 * Create by jky on 2018/01/17
 * MailSender类的生产工厂类
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
