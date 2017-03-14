package com.example.test;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 * jpa 基本数据操作
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private IUserService userService;

    /* @Test
     public void testAdd() {
         UserEntity user = new UserEntity();
         user.setEmail("393156105@qq.com");
         user.setNickName("qqqqqqqqq");
         user.setPassword("123456");
         user.setUserName("zslin");

         userService.save(user);
     }

     @Test
     public void testFind() {
         UserEntity user = userService.findOne(1);
         System.out.println("nickName : "+user.getNickName()+", email : "+user.getEmail());
     }

     @Test
     public void testUpdate() {
         UserEntity user = userService.findOne(1);
         user.setNickName("aaaaaaaaaa");
         userService.save(user);
         System.out.println("nickName : "+user.getNickName()+", email : "+user.getEmail());
     }

     @Test
     public void testDelete() {
         userService.delete(1);
     }

     @Test
     public void testAddBatch() {
         for(Integer i=0; i < 5; i++) {
             UserEntity user = new UserEntity();
             user.setNickName("昵称"+i);
             user.setUserName("user"+i);
             user.setPassword("pwd"+i);
             user.setEmail("email"+i+"@domain.com");
             userService.save(user);
         }
     }

     @Test
     public void testFindAll() {
         List<UserEntity> list = userService.findAll();
         for(UserEntity u : list) {
             System.out.println("nickName : "+u.getNickName()+", email : "+u.getEmail());
         }
     }*/
    @Test
    public void testAdd() {
        for (Integer i = 0; i < 5; i++) {
            UserEntity user = new UserEntity();
            user.setNickName("qqq" + i);
            user.setUserName("user" + i);
            user.setPassword("pwd" + i);
            user.setEmail("email" + i + "@domain.com");
            userService.save(user);
        }
    }

    @Test
    public void testFindById() {
        UserEntity u = userService.findById(3);
        System.out.println("nickName : " + u.getNickName() + ", email : " + u.getEmail());
    }

    @Test
    public void testFindByUserName() {
        UserEntity u = userService.findByUserName("user3");
        System.out.println("nickName : " + u.getNickName() + ", email : " + u.getEmail());
    }

    @Test
    public void testFindByNameAndPwd() {
        UserEntity u = userService.findByUserNameAndPassword("user4", "pwd4");
        System.out.println("nickName : " + u.getNickName() + ", email : " + u.getEmail());
    }

    @Test
    public void test() {
        List<UserEntity> list = userService.findByUserNameLike("user%");
        System.out.println(list.size());
    }

    @Test
    public void test2() {
        List<UserEntity> list = userService.findByUserNameNotLike("user4");
        System.out.println(list.size());
    }

    @Test
    public void test3() {
        List<UserEntity> list = userService.findByUserNameNot("user3");
        System.out.println(list.size());
    }

    @Test
    public void testQuery() {
        List<UserEntity> list = userService.findAll("user3");
        System.out.println(list.size());
    }

    @Test
    public void testUpdate() {
        userService.updatePwd("user1", "123456");
    }

    @Test
    public void testDelete() {
        userService.deleteByUserName("user4");
    }

    @Test
    public void testUpdate2() {
        userService.updateEmail("user2", "user2@qq.com");
    }

}
