package com.jky.design.patterns.decorator;

/**
 * Create by jky on 2018/01/19
 */
public class Test {


    public void test(){
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
