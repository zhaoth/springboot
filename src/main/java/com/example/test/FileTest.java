package com.example.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;

import java.io.File;

/**
 * Created by Administrator on 2017/3/8.
 * 文件上传
 */
public class FileTest {
    @Value("${web.upload-path}")
    private String path = "e:/";

    /**
     * 文件上传测试
     */
    @Test
    public void uploadTest() throws Exception {
        File f = new File("E:/vim_go.png");
        FileCopyUtils.copy(f, new File(path + "/1.png"));
    }

    @Test
    public void listFilesTest() {
        File file = new File(path);
        for (File f : file.listFiles()) {
            System.out.println("fileName : " + f.getName());
        }
    }
}
