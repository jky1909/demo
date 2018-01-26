package com.jky.design.patterns.factorymethod;

/**
 * @author jky
 * @Create Date 2018-01-16
 * 邮件发送实现类
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
