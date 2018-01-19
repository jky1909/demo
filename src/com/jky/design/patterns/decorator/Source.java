package com.jky.design.patterns.decorator;

/**
 * Create by jky on 2018/01/19
 * 被装饰类
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
