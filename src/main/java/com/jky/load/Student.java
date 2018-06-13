package com.jky.load;

/**
 * @author jky
 * @date 2018/6/13 下午 06:35
 */
public class Student {
    static {
        System.out.println("我是静态块！");
    }

    int age = 10;

    public static void StudentFactory(int age){
        System.out.println("我是静态方法！");
        age = age;
        System.out.println("age:" + age);
    }

    {
        System.out.println("我是普通块！");
    }

    Student(){
        System.out.println("我是构造方法!");
        System.out.println("age:" + age);
    }
}
