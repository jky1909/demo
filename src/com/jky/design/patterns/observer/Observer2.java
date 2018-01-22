package com.jky.design.patterns.observer;

/**
 * Create by jky on 2018/01/22
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
