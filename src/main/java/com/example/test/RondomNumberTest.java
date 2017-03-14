package com.example.test;

import com.example.service.BlogProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/2/28.
 * 操作配置文件
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RondomNumberTest {

    private static final Log log = LogFactory.getLog(RondomNumberTest.class);
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void testQuery() throws Exception {
//        Assert.assertEquals("程序猿DD", blogProperties.getName());
//        Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());
//        Assert.assertEquals("程序猿DD正在努力写《Spring Boot教程》", blogProperties.getDesc());
        System.out.println("随机数测试输出：");
        System.out.println("随机字符串 : " + blogProperties.getValue());
        System.out.println("随机int : " + blogProperties.getNumber());
        System.out.println("随机long : " + blogProperties.getBignumber());
        System.out.println("随机10以下 : " + blogProperties.getTest1());
        System.out.println("随机10-20 : " + blogProperties.getTest2());
    }


}
