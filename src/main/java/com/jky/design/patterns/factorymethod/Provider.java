package com.jky.design.patterns.factorymethod;

/**
 * Create by jky on 2018/01/17
 * 抽象工厂接口
 */
public interface Provider {
    /**
     * 生产Sender的实现类对象
     * @return
     */
    Sender produce();
}
