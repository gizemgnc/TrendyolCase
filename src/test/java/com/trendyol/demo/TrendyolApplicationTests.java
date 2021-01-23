package com.trendyol.demo;

import com.trendyol.demo.models.User;
import com.trendyol.demo.restApi.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class TrendyolApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	void contextLoads() {
		User user = new User(15,"Happyy","master","denem123","deneme123",new Date(2020,10,10),"asdasd");
		userController.addUser(user);
	}

}
