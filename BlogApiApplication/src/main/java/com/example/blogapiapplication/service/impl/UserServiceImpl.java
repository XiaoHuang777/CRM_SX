package com.example.blogapiapplication.service.impl;

import com.example.blogapiapplication.entity.User;
import com.example.blogapiapplication.mapper.UserMapper;
import com.example.blogapiapplication.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaohuang
 * @since 2021-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
