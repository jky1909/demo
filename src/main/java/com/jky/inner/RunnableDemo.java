package com.jky.inner;

/**
 * @author jky
 * @date 2018/3/7 15:44
 * Runnable接口的匿名内部类实现
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                }
            }
        });
        thread.start();
    }
}
