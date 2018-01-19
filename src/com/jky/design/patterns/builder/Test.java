package com.jky.design.patterns.builder;

import com.jky.design.patterns.factorymethod.Sender;

import java.util.List;

/**
 * Create by jky on 2018/01/18
 * 建造者模式测试类
 */
public class Test {

    @org.junit.Test
    public void test(){
        Builder builder = new Builder();
        builder.produceSmsSnder(10);
        builder.produceMailSnder(10);
    }
}
