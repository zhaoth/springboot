package com.example.test;

import com.example.dao.WorkDao;
import com.example.entity.WorkEntity;
import com.example.service.WorkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class WorkTest {
    @Autowired
    private WorkService workService;
    @Autowired
    private WorkDao workDao;


    @Test
    public void testQuery() {
        List<WorkEntity> list = workService.findAll();
        System.out.println(list.get(0).getEno());
    }


}
