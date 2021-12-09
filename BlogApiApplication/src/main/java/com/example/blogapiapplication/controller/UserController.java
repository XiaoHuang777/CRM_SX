package com.example.blogapiapplication.controller;


import com.example.blogapiapplication.entity.User;
import com.example.blogapiapplication.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaohuang
 * @since 2021-12-07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    /**
     * 测试实体校验
     *
     * @param user 入参
     * @return Object
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return user.toString();
    }
}
