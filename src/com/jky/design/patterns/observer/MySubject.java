package com.jky.design.patterns.observer;

/**
 *Create by jky on 2018/01/22
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
