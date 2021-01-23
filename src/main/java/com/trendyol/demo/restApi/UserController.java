package com.trendyol.demo.restApi;

import com.trendyol.demo.models.User;
import com.trendyol.demo.service.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private IUserManager userManager;

    @Autowired
    public UserController(IUserManager userManager) {
        this.userManager = userManager;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userManager.addUser(user);
    }

    @PostMapping("/removeUser/{id}")
    public void removeUserById(@PathVariable int id){
        userManager.removeUserById(id);
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userManager.updateUser(user);
    }

    @GetMapping("/findUser/{id}")
    public User findById(@PathVariable int id){
        return userManager.findById(id);
    }
}
