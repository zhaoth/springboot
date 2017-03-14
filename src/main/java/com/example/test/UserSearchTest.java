package com.example.test;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import com.example.tools.BaseSearch;
import com.example.tools.SearchDto;
import com.example.tools.SearchTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * Created by Administrator on 2017/2/28.
 * jpa
 * Specification
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserSearchTest {

    @Autowired
    private IUserService userService;

    private void print(List<UserEntity> list) {
        for (UserEntity u : list) {
            System.out.println(u.getId() + "===" + u.getUserName());
        }
    }

    @Test
    public void test1() {
        List<UserEntity> list = userService.findAll(new BaseSearch<UserEntity>(new SearchDto("userName", "eq", "user1")));
        print(list);
    }

    @Test
    public void test2() {
        List<UserEntity> list = userService.findAll(SearchTools.buildSpecification(
                SearchTools.buildSpeDto("and", new SearchDto("and", "id", "gt", 14)),
                SearchTools.buildSpeDto("and", new SearchDto("userName", "ne", "user5"),
                        new SearchDto("or", "userName", "ne", "user9"))
        ));
        print(list);
    }
}
