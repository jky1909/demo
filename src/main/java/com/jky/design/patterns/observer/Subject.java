package com.jky.design.patterns.observer;

/**
 * Create by jky on 2018/01/22
 */
public interface Subject {

    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作*/
    void operation();
}
