package com.jky.annotation;

import java.lang.annotation.*;

/**
 * @author jky
 * @date 2018/2/1 14:43
 * 水果颜色注解
 */

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    public enum Color{ BLUE,RED,GREEN};
    Color fruitColor() default Color.GREEN;
}
