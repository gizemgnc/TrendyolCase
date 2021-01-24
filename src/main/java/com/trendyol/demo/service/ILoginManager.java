package com.trendyol.demo.service;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.User;

public interface ILoginManager {
    User findUserByUserName(String userName);
    boolean checkValidty(Login login);
}
