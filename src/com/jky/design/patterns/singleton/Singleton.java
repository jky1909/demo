package com.jky.design.patterns.singleton;

/**
 * Create by jky on 2018/01/17
 * 懒汉式单例（静态内部类）
 */
public class Singleton {
    /* 私有构造方法，防止被实例化 */
    private Singleton(){
    }

    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

}
