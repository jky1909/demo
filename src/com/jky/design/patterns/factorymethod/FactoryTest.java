package com.jky.design.patterns.factorymethod;

import org.junit.Test;

/**
 * @author jky
 * @Time 2018-01-16
 * 工厂方法测试
 */
public class FactoryTest {

    /**
     *普通工厂方法模式测试
     */
    @Test
    public void test(){
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }

    /**
     * 多个工厂方法模式测试
     */
    @Test
    public void testMany(){
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }

    /**
     * 静态工厂方法模式测试
     */
    @Test
    public void testStatic(){
        Sender sender = SendFactory.produceSmsSender();
        sender.send();
    }

    /**
     * 抽象工厂方法模式测试
     */
    @Test
    public void testAbstract(){
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
