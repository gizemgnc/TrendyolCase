package com.trendyol.demo;

import com.trendyol.demo.models.User;
import com.trendyol.demo.repository.IUserDal;
import com.trendyol.demo.service.UserManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserControllerTester {
    @InjectMocks
    private UserManager userManager;

    @Mock
    private IUserDal iUserDal;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUserById () {
        User user = new User(1,"Gizem","Genç","Gizot","waffle34",new Date(1997,03,02),"İstanbul");
        when(iUserDal.findById(1)).thenReturn(user);

        User value  = userManager.findById(1);
        verify(iUserDal).findById(1);

        assertEquals("Gizem",value.getName());
        assertEquals("Gizot",value.getUserName());

    }

    @Test
    public void testAddUser () {
        User user = new User(1,"Gizem","Genç","Gizot123","Waffle34!",new Date(1997,03,02),"İstanbul");
        when(iUserDal.addUser(user)).thenReturn(user.toString());

        String value  = userManager.addUser(user);
        verify(iUserDal).addUser(user);

        assertEquals(user.toString(),value);

    }

    @Test
    public void testRemoveUserById () {
        userManager.removeUserById(1);
        verify(iUserDal,times(1)).removeUserById(1);

    }

    @Test
    public void testUpdateUser () {
        User user = new User(1,"Gizem","Genç","Gizot123","Waffle34!",new Date(1997,03,02),"İstanbul");

        userManager.updateUser(user);
        verify(iUserDal,times(1)).updateUser(user);

    }
}
