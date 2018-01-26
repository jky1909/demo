package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * final示例
 * A类被final修饰，B类不能继承
 */
public class A {
    public final void f(){
        System.out.println("类A中的final方法f被调用了");
    }
}
