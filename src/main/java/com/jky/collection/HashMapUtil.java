package com.jky.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author jky
 * @date 2018/2/7 11:17
 * HashMap 的使用
 */
public class HashMapUtil {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>(16);

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");

        Set set = map.entrySet();
        map.remove("3");

        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if("2".equals(entry.getKey())){
               iterator.remove();
               continue;
            }
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
