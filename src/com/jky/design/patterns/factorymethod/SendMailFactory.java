package com.jky.design.patterns.factorymethod;

/**
 * Create by jky on 2018/01/18
 *MailSender类的工厂类
 */
public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
