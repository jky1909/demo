package com.aop;

/**
 * @author jky
 * @date 2018/4/20 15:34
 */
public class HelloWorldImpl2 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
    }
}
