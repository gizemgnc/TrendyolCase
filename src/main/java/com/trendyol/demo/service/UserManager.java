package com.trendyol.demo.service;

import com.trendyol.demo.models.User;
import com.trendyol.demo.repository.IUserDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements IUserManager {
    private IUserDal userDal;

    @Autowired
    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }

    @Override
    public String addUser(User user) {
        SignUpValidityFacade signUpValidityFacade = new SignUpValidityFacade(user.getUserName(), user.getPassword());
        if (signUpValidityFacade.checkValidity()) {
            userDal.addUser(user);
            return user.toString();
        } else
            return signUpValidityFacade.getErrorMessage().toString();
    }

    @Override
    public void removeUserById(int id) {
        userDal.removeUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDal.updateUser(user);
    }

    @Override
    public User findById(int id) {
        return userDal.findById(id);
    }
}
