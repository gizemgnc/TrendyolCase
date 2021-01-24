package com.trendyol.demo.service;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.Response;
import com.trendyol.demo.models.User;

public interface ILoginManager {
    Response findUserByUserName(String userName) throws Exception;
    Response checkValidty(Login login);
}
