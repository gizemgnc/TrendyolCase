package com.trendyol.demo.restApi;

import com.trendyol.demo.models.User;
import com.trendyol.demo.service.ILoginManager;
import com.trendyol.demo.service.LoginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    private ILoginManager loginManager;

    @Autowired
    public LoginController(ILoginManager loginManager) {
        this.loginManager = loginManager;
    }

    @PostMapping("/login")
    public boolean checkValidtyLogin(@RequestBody String userName,String password) {
        loginManager.findUserByUserName(userName);
        return loginManager.checkValidty(userName,password);
    }
}
