package com.jky.inner;

/**
 * @author jky
 * @date 2018/2/10 9:23
 * 一个内部类的例子
 */
public class OuterClass {
    private String outerName;
    private int outerAge;
    public class InnerClass{
        private String innerName;
        private int innerAge;

        InnerClass(){
            //内部类可以访问外部类的元素
            outerName="I am outer class";
            outerAge=23;
        }
        public void display(){
            System.out.println(outerName+" and my age is "+outerAge);
        }
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }
}
