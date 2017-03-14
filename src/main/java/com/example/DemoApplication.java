package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//https://github.com/dyc87112/SpringBoot-Learning

/**
 * @EnableAutoConfiguration:spring boot的注解，一般只用于主类，
 * 是无xml配置启动的关键部分,明确指定了扫描包的路径为其修饰的主类的包（这也就是为什么主类要放在根包路径下的原因）
 * @ComponentScan 进行包的扫描，扫描路径由@EnableAutoConfiguration指定了
 * <p>
 * 主类要位于根包路径下，方便之后的扫描(We generally recommend that you locate your main application class in a root package above other classes.)
 */
@SpringBootApplication
@EnableSwagger2             //启动swagger注解 访问http://localhost:8081/swagger-ui.html
//@EnableScheduling        //启动计划任务
public class
DemoApplication {
    //    spring boot的入口，在整个子项目在内，
//    只能有一个main方法，否则spring boot启动不起来
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
