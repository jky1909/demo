package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * 类的final变量和普通变量
 * 当final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，则编译器会把它当做编译期常量使用
 * 不过要注意，只有在编译期间能确切知道final变量值的情况下，编译器才会进行这样的优化
 */
public class TestFinal3 {
    public static void main(String[] args)  {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
    }
}
