package com.jky.finaldemo;

/**
 * final 参数的问题，参数变为只读
 * @author jky
 * @date 2018/01/23
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
