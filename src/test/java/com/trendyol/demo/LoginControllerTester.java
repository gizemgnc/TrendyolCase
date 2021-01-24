package com.trendyol.demo;

import com.trendyol.demo.models.Login;
import com.trendyol.demo.models.Response;
import com.trendyol.demo.models.User;
import com.trendyol.demo.repository.ILoginDal;
import com.trendyol.demo.repository.IUserDal;
import com.trendyol.demo.service.LoginManager;
import com.trendyol.demo.service.UserManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginControllerTester {

    @InjectMocks
    private LoginManager loginManager;

    @Mock
    private ILoginDal iLoginDal;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testCheckValidtyLogin() throws Exception {
        User user = new User(1, "Gizem", "Genç", "Gizot123", "Waffle34!", new Date(1997, 03, 02), "İstanbul");
        Login login = new Login();
        login.setUserName("Gizot123");
        login.setPassword("Waffle34!");

        when(iLoginDal.findUserByUserName(login.getUserName())).thenReturn(user);
        loginManager.findUserByUserName(login.getUserName());
        Response value = loginManager.checkValidty(login);
        verify(iLoginDal).findUserByUserName(login.getUserName());

        assertEquals(1, value.getReturnCode());


    }


}
