package com.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author jky
 * @date 2018/4/19 14:56
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public int update() {
        System.out.println("进行数据库语句编写");
        return 0;
    }
}
