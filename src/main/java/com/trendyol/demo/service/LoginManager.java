package com.trendyol.demo.service;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.Response;
import com.trendyol.demo.models.User;
import com.trendyol.demo.repository.ILoginDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginManager implements ILoginManager {
    private ILoginDal loginDal;
    private User user;
    private Response response;

    @Autowired
    public LoginManager(ILoginDal loginDal) {
        this.loginDal = loginDal;
    }

    @Override
    public User findUserByUserName(String userName) {
        user = loginDal.findUserByUserName(userName);
        return user;
    }

    public Response checkValidty(Login login) {
        response = new Response();
        if (user.getUserName().equals(login.getUserName()) && user.getPassword().equals(login.getPassword())) {
            response.setReturnCode(1);
            response.setReturnMessage("Giriş başarılı.");
        } else {
            response.setReturnCode(0);
            response.setReturnMessage("Giriş başarısız. Username/Password hatalı.");
        }
        return response;
    }
}
