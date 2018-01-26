package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 *
 */
public class TestFinal2 {
    public static void main(String[] args){
        TestFinal2 testFinal = new TestFinal2();
        StringBuffer buffer = new StringBuffer("hello");
        testFinal.changeValue(buffer);
        System.out.println(buffer);

    }

    public void changeValue( final StringBuffer buffer){
        //final修饰引用类型的参数，不能再让其指向其他对象，但是对其所指向的内容是可以更改的。
        //buffer = new StringBuffer("hi");
        buffer.append("world");
    }
}
