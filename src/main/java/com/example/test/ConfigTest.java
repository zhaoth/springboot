package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/2/28.
 * 操作配置文件
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfigTest {
    @Value("${test.msg}")
    private String msg;

    @Test
    public void testQuery() throws Exception {
        System.out.println("=中文==" + msg);
    }
}
