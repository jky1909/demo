package com.jky.finaldemo;

/**
 * Create by jky on 2018/01/23
 * final example
 */
public class B extends A{
    // 编译错误！父类的f方法是final类型，不可重写！如果父类的f方法是private，子类可以定义此方法
    // 但此处不是重写
    // public void f() {
    //     System.out.println("类B中的方法f被调用了");
    // }
}
