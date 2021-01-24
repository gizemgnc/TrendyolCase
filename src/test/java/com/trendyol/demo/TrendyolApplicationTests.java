package com.trendyol.demo;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.User;
import com.trendyol.demo.restApi.LoginController;
import com.trendyol.demo.restApi.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class TrendyolApplicationTests {

	@Autowired
	private LoginController loginController;

	@Test
	void contextLoads() {
		Login login = new Login();
		login.setUserName("alis5");
		login.setPassword("waffle34.");

		loginController.checkValidtyLogin(login);
	}

}
