package com.trendyol.demo.service;

import com.trendyol.demo.models.User;
import com.trendyol.demo.repository.ILoginDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginManager implements ILoginManager {
    private ILoginDal loginDal;
    private User user;

    @Autowired
    public LoginManager(ILoginDal loginDal) {
        this.loginDal = loginDal;
    }

    @Override
    public User findUserByUserName(String userName) {
        user = loginDal.findUserByUserName(userName);
        return user;
    }

    public boolean checkValidty(String userName, String password) {
        if (user.getUserName().equals(userName) && user.getPassword().equals(password))
            return true;
        return false;
    }
}
