package com.example.stringdemo;

/**
 * @author jky
 * @date 2018/5/31 10:46
 */
public class StringTest {

    private static final String MESSAGE="taobao";
    public static void main (String[] args) {
        String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
        System.out.println(classFile);

        String a ="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);

    }
}
