package com.jky.exception;

/**
 * @author jky
 * @date 2018/3/22 9:20
 */
public class Demo {
    public static void main(String[] args) {
        String str = "aaa";
        int a = 0;
       try{
           try {
               a = getInt(str);
           }catch (Exception e){
               System.out.println("我爱北京天安门");
               e.printStackTrace();

           }
       }catch (Exception e){
           System.out.println("天安门上太阳升");
           e.printStackTrace();
       }

        System.out.println("伟大领袖");
    }

    private static int getInt(String str) {
        int a = Integer.valueOf(str);
        return a;
    }


}
