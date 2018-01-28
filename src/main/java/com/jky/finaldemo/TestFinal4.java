package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * 这里要注意一点就是：不要以为某些数据是final就可以在编译期知道其值，通过变量b我们就知道了，
 * 在这里是使用getHello()方法对其进行初始化，他要在运行期才能知道其值。
 */
public class TestFinal4 {
    public static void main(String[] args)  {
        String a = "hello2";
        final String b = getHello();
        String c = b + 2;
        System.out.println((a == c));

    }

    public static String getHello() {
        return "hello";
    }
}
