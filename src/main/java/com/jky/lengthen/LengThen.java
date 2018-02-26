package com.jky.lengthen;

/**
 * @author jky
 * @date 2018/2/7 18:11
 * 变长参数
 */
public class LengThen {
    public static void main(String[] args) {
        leng(1,2,3,4);

    }


    public static void leng(int... args){
        for(int i : args){
            System.out.println(i);
        }

    }
}
