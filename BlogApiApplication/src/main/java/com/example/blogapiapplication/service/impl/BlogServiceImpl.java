package com.example.blogapiapplication.service.impl;

import com.example.blogapiapplication.entity.Blog;
import com.example.blogapiapplication.mapper.BlogMapper;
import com.example.blogapiapplication.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
