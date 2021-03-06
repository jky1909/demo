package com.jky.reflection;

/**
 * @author jky
 * @date 2018/2/1 20:38
 */
public class Student {

    /**
     *（默认的构造方法）
     */
    Student(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    /**
     * 无参构造方法
     */
    public Student(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    /**
     * 有一个参数的构造方法
     * @param name
     */
    public Student(char name){
        System.out.println("姓名：" + name);
    }

    /**
     * 有多个参数的构造方法
     * @param name
     * @param age
     */
    public Student(String name ,int age){
        //这的执行效率有问题，以后解决。
        System.out.println("姓名："+name+"年龄："+ age);
    }

    /**
     * 受保护的构造方法
     * @param n
     */
    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    /**
     * 私有构造方法
     * @param age
     */
    private Student(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }
}
