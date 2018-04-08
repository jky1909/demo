package com.jky.generics;

/**
 * @author jky
 * @date 2018/4/2 10:06
 * 泛型方法
 */
public class TestGenerics {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        TestGenerics testGenerics = new TestGenerics();
        Object object = testGenerics.getObject(Class.forName("com.jky.passby.Student"));
        System.out.println(object);
    }

    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        return t;
    }
}
