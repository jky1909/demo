package com.jky.inner;

/**
 * @author jky
 * @date 2018/3/7 15:27
 * Thread类的匿名内部类实现
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };

        thread.start();
    }
}
