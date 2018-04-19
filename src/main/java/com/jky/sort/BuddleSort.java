package com.jky.sort;

/**
 * @author jky
 * @date 2018/4/19 16:54
 * 冒泡排序
 */
public class BuddleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,2,6,3,8,9};
        buddle(array);
    }

    private static void buddle(int[] array){
        for(int j = 0; j < array.length-1; j++){
            for (int i = 0; i < array.length-1-j; i++) {
                int temp = array[i];
                if(array[i] > array[i+1]){
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
