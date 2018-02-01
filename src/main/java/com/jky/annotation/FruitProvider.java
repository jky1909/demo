package com.jky.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jky
 * @date 2018/2/1 14:52
 * 水果供应者注解
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    /**
     * 供应商编号
     */
    public int id() default -1;

    /**
     * 供应商名称
     */
    public String name() default "";

    /**
     * 供应商地址
     */
    public String address() default "";
}
