package com.jky.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @author jky
 * @date 2018/2/27 15:00
 * Calendar类的学习
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar与date的转换
        Calendar calendar = Calendar.getInstance();
        // 从一个 Calendar 对象中获取 Date 对象
        Date date = calendar.getTime();
        System.out.println(date);
        // 将 Date 对象反应到一个 Calendar 对象中，
        // Calendar/GregorianCalendar 没有构造函数可以接受 Date 对象
        // 所以我们必需先获得一个实例，然后设置 Date 对象
        calendar.setTime(date);

        //获取年份
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        //获取月份
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        //获取其他
        calendar.get(Calendar.DATE);//日
        calendar.get(Calendar.HOUR_OF_DAY);//时
        calendar.get(Calendar.MINUTE);//分
        calendar.get(Calendar.SECOND);//秒
        calendar.get(Calendar.DAY_OF_WEEK);//星期（Locale.ENGLISH情况下，周日是1,剩下自己推算）

        Calendar calendar1New = Calendar.getInstance();
        // 设定为 5 小时以前，后者大，显示 -1
        calendar1New.add(Calendar.MONTH,-5);
        System.out.println(calendar1New.compareTo(calendar));

        

    }
}
