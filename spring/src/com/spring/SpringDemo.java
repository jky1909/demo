package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jky
 * @date 2018/4/19 11:29
 */
public class SpringDemo {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //检索配置实例spring.Student")
        Student student = (Student)context.getBean("student");

//        student.setName("张三");
//        student.setAge(15);
        System.out.println(student);

    }
}
