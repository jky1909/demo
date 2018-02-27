package com.jky.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jky
 * @date 2018/2/27 9:08
 * 有关日和时间期方面的知识
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException, InterruptedException {
        //获取当天日期和时间
        Date date = new Date();
        System.out.println(date);

        //获取指定格式的日期和时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy-MM-dd hh:mm:ss a zzz");
        System.out.println(simpleDateFormat.format(date));

        //字符串转换为时间日期
        String str = "星期二 2018-02-27 02:15:29 下午 CST";
        Date date2 = simpleDateFormat.parse(str);
        System.out.println(date2);

        //测量执行时间
        Long start = System.currentTimeMillis();
        Thread.sleep(5*60*10);
        Long end = System.currentTimeMillis();
        Long diff = end - start;
        System.out.println(diff);

        //

    }


}
