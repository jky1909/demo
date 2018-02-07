package com.jky.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jky
 * @date 2018/2/7 11:07
 * ArrayList 的使用
 */
public class ArrayListUtil {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("889");

        listIterator(list);
        //iterator(list);

    }

    public static void listIterator(List<String> list){
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            if("abc".equals(str)){
                listIterator.remove();
                listIterator.add("bbb");
            }

        }
        System.out.println(list);
    }

    public static void iterator(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object str =  iterator.next();
            if("123".equals(str)){
                iterator.remove();

            }

        }
        System.out.println(list);
    }


}
