package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jky
 * @date 2018/4/20 15:37
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        HelloWorld hw1 = (HelloWorld)context.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld)context.getBean("helloWorldImpl2");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }
}
