package com.aop;

/**
 * @author jky
 * @date 2018/4/20 15:35
 * 横切关注点
 */
public class TimeHandler {
    public void printTime()
    {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }
}
