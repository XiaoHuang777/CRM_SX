package com.xiaohuang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.xiaohuang.entity.SysAuth;
import com.xiaohuang.mapper.SysAuthMapper;
import com.xiaohuang.service.SysAuthService;


/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:47
 **/
@Service
public class SysAuthServiceImpl extends ServiceImpl<SysAuthMapper, SysAuth> implements SysAuthService {
}
