package com.example.test;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/2/28.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInitTest {
    @Autowired
    private IUserService userService;

    @Test
    public void initTest() {
        for (int i = 1; i <= 10; i++) {
            UserEntity u = new UserEntity();
            u.setEmail("email" + i + "@domain.com");
            u.setPassword("pwd" + i);
            u.setUserName("user" + i);
            u.setNickName("nickname" + i);
            userService.save(u);
        }
    }
}
