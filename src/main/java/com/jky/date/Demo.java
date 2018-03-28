package com.jky.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jky
 * @date 2018/3/22 14:29
 */
public class Demo {
    public static void main(String[] args) {

        String str= formatDate("2018-02-05");
        System.out.println("返回值：" + str);


    }


    private static String formatDate(String birth) {
        try {
            if(null == birth){
                return "";
            }
            Date birthDate = null;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

            if(birth.contains(":")){
                birthDate = simpleDateFormat2.parse(birth);
            }else {
                birthDate = simpleDateFormat1.parse(birth);
            }
            String str = simpleDateFormat.format(birthDate);
            return str;
        }catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
