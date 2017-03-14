package com.example.test;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import com.example.tools.SortDto;
import com.example.tools.SortTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 * jpa排序
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserSortTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testSort() {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        List<UserEntity> list = userService.findAll(sort);
        for (UserEntity u : list) {
            System.out.println(u.getUserName());
        }
    }

    @Test
    public void testSort2() {
        List<UserEntity> list = userService.findAll(SortTools.basicSort());
        for (UserEntity u : list) {
            System.out.println(u.getUserName());
        }
    }

    @Test
    public void testSort3() {
        List<UserEntity> list = userService.findAll(SortTools.basicSort("desc", "userName"));
        for (UserEntity u : list) {
            System.out.println(u.getId() + "====" + u.getUserName());
        }
    }

    @Test
    public void testSort4() {
        List<UserEntity> list = userService.findAll(SortTools.basicSort(new SortDto("desc", "userName"), new SortDto("id")));
        for (UserEntity u : list) {
            System.out.println(u.getId() + "====" + u.getUserName());
        }
    }
}
