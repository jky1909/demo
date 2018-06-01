package com.example.finallyTest;

/**
 * @author jky
 * @date 2018/5/31 15:50
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("return value of getValue(): " +
                getValue());
    }
    public static int getValue() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
