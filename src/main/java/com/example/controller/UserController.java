package com.example.controller;

import com.example.entity.UserEntity;
import com.example.service.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9.
 * restful api
 */
@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下，可去除
@Api("userController相关api")
public class UserController {
    @Autowired
    IUserService userService;


    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "username", dataType = "String", required = true, value = "用户的姓名", defaultValue = "zhaojigang"),
            @ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value = "用户的密码", defaultValue = "wangna")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserEntity> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserEntity> r = userService.findAll();
        return r;
    }

//    @RequestMapping(value="/", method=RequestMethod.POST)
//    public String postUser(@ModelAttribute UserEntity user) {
//        // 处理"/users/"的POST请求，用来创建User
//        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
//        UserEntity r = userService.save(user);
//        return "success";
//    }
//
//    @RequestMapping(value="/{id}", method= RequestMethod.GET)
//    public String getUser(@PathVariable Integer id) {
//        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
//        // url中的id可通过@PathVariable绑定到函数的参数中
//        UserEntity r = userService.findById(id);
//        return r.getEmail();
//    }
//
//    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
//    public String putUser(@PathVariable Integer id, @ModelAttribute UserEntity user) {
//        // 处理"/users/{id}"的PUT请求，用来更新User信息
//        UserEntity u = userService.findById(id);
//
//        return "success";
//    }
//
//    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
//    public String deleteUser(@PathVariable Integer id) {
//        // 处理"/users/{id}"的DELETE请求，用来删除User
//        userService.delete(id);
//        return "success";
//    }

}
