package com.jky.design.patterns.decorator;

/**
 * Create by jky on 2018/01/19
 * 装饰类
 */
public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(){

    }

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
