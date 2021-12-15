package com.xiaohuang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaohuang.service.SysRoleAuthService;
import org.springframework.stereotype.Service;
import com.xiaohuang.entity.SysRoleAuth;
import com.xiaohuang.mapper.SysRoleAuthMapper;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:49
 **/
@Service
public class SysRoleAuthServiceImpl extends ServiceImpl<SysRoleAuthMapper, SysRoleAuth> implements SysRoleAuthService {
}
