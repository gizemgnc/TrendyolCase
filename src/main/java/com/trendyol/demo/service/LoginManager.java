package com.trendyol.demo.service;

import com.trendyol.demo.models.Login;
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

    public boolean checkValidty(Login login) {
        if (user.getUserName().equals(login.getUserName()) && user.getPassword().equals(login.getPassword()))
            return true;
        return false;
    }
}
