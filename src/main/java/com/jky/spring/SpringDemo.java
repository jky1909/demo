package com.jky.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author jky
 * @date 2018/4/10 16:16
 */
public class SpringDemo {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //检索配置实例spring.Student")
        Student student = (Student)context.getBean("student");

        student.setName("张三");
        student.setAge(15);
        System.out.println(student);

    }

}
