package com.jky.staticdemo;

/**
 * Create jky on 2018/01/24
 * java 类加载的顺序
 */
public class A {
    // 静态变量
    static int i = 1;
    // 静态语句块
    static {
        System.out.println("Class A1:static blocks" + i);
    }
    // 非静态变量
    int j = 1;
    // 静态语句块
    static {
        i++;
        System.out.println("Class A2:static blocks" + i);
    }

    // 构造函数
    public A() {
        i++;
        j++;
        System.out.println("constructor A: " + "i=" + i + ",j=" + j);
    }

    // 非静态语句块
    {
        i++;
        j++;
        System.out.println("Class A:common blocks" + "i=" + i + ",j=" + j);
    }

    // 非静态方法
    public void aDisplay() {
        i++;
        System.out.println("Class A:static void aDisplay(): " + "i=" + i + ",j=" + j);
        return;
    }

    // 静态方法
    public static void aTest() {
        i++;
        System.out.println("Class A:static void aTest(): " + "i=" + i);
        return;
    }
}
