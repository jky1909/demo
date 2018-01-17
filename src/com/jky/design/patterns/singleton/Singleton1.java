package com.jky.design.patterns.singleton;

/**
 * Create by jky on 2018/01/17
 * 饿汉式单例模式
 */
public class Singleton1 {
    private Singleton1(){
    }

    private static final Singleton1 SINGLETON_1 = new Singleton1();

    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }
}
