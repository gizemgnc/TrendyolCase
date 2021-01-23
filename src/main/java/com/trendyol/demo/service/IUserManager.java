package com.trendyol.demo.service;

import com.trendyol.demo.models.User;

public interface IUserManager {
    void addUser(User user);
    void removeUserById(int id);
    void updateUser(User user);
    User findById(int id);
}
