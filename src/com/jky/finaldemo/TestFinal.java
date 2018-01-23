package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * final 参数的问题，参数变为只读
 */
public class TestFinal {
    public static void main(String[] args){
        TestFinal testFinal = new TestFinal();
        int i = 0;
        testFinal.changeValue(i);
        System.out.println(i);

    }

    public void changeValue(final int i){
        //final参数不可改变
        //i++;
        System.out.println(i);
    }
}
