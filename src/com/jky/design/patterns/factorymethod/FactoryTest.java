package com.jky.design.patterns.factorymethod;

import org.junit.Test;

/**
 * @author jky
 * @Create Date
 * 工厂方法测试
 */
public class FactoryTest {

    @Test
    public void test(){
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
