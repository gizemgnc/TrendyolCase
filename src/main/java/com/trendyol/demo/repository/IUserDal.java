package com.trendyol.demo.repository;

import com.trendyol.demo.models.User;

public interface IUserDal {
    void addUser(User user);
    void removeUserById(int id);
    void updateUser(User user);
    User findById(int id);

}
