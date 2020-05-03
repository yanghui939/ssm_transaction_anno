package com.yh.dao;

import com.yh.pojo.User;

public interface UserDao {

    User findById(Integer id);

    void updateUser(User user);
}
