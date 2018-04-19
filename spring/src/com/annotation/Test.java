package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jky
 * @date 2018/4/19 15:00
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
//        UserDAO userDAO = (UserDAO)context.getBean("userDAOImpl");
//        userDAO.update();

        UserService userService = (UserService)context.getBean("userServiceImpl");
        userService.doUpdate();

        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource);

    }
}
