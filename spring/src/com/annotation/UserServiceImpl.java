package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jky
 * @date 2018/4/19 14:59
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public int doUpdate() {
        System.out.println("UserServiceImpl update()方法开始....");
        userDAO.update();
        return 0;
    }
}
