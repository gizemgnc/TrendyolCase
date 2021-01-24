package com.trendyol.demo.restApi;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.Response;
import com.trendyol.demo.service.ILoginManager;
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
    public Response checkValidtyLogin(@RequestBody Login login)  {
        Response response = new Response();
        try {
            loginManager.findUserByUserName(login.getUserName());
            return loginManager.checkValidty(login);
        }catch (Exception e){
            response.setReturnCode(0);
            response.setReturnMessage("Giriş başarısız. Username/Password hatalı.");
            return response;
        }
    }
}
