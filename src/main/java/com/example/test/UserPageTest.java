package com.example.test;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import com.example.tools.PageableTools;
import com.example.tools.SortDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/2/28.
 * jpa数据分页
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserPageTest {
    @Autowired
    private IUserService userService;

    @Test
    public void test1() {
        Pageable pageable = new PageRequest(0, 5);
        Page<UserEntity> datas = userService.findAll(pageable);
        System.out.println("总条数：" + datas.getTotalElements());
        System.out.println("总页数：" + datas.getTotalPages());
        for (UserEntity u : datas) {
            System.out.println(u.getId() + "====" + u.getUserName());
        }
    }

    private void print(Page<UserEntity> datas) {
        System.out.println("总条数：" + datas.getTotalElements());
        System.out.println("总页数：" + datas.getTotalPages());
        for (UserEntity u : datas) {
            System.out.println(u.getId() + "====" + u.getUserName());
        }
    }

    @Test
    public void test2() {
        Page<UserEntity> datas = userService.findAll(PageableTools.basicPage(0));
        print(datas);
    }

    @Test
    public void test3() {
        Page<UserEntity> datas = userService.findAll(PageableTools.basicPage(1, 5));
        print(datas);
    }

    @Test
    public void test4() {
        Page<UserEntity> datas = userService.findAll(PageableTools.basicPage(1, 5, new SortDto("id")));
        print(datas);

        Page<UserEntity> datas2 = userService.findAll(PageableTools.basicPage(1, 5, new SortDto("ASC", "id")));
        print(datas2);
    }
}
