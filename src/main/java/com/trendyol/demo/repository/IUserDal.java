package com.trendyol.demo.repository;

import com.trendyol.demo.models.User;

public interface IUserDal {
    String addUser(User user);
    void removeUserById(int id);
    void updateUser(User user);
    User findById(int id);

}
