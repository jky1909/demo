package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * 被final修饰的引用变量指向的对象内容可变
 */
public class TestFinal1 {
    public static void main(String[] args)  {
        final MyClass myClass = new MyClass();
        System.out.println(++myClass.i);

    }
}

class MyClass {
    public int i = 0;
}
