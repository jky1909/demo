package com.jky.design.patterns.builder;

/**
 * @author jky
 * @date 2018/01/18
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
