package com.xiaohuang.controller;

import com.xiaohuang.service.SysUserRoleService;
import com.xiaohuang.service.SysUserService;
import com.xiaohuang.utils.ResponseUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xiaohuang.entity.SysUser;
import com.xiaohuang.entity.SysUserRole;

import javax.annotation.Resource;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:18
 **/
@RestController
@RequestMapping(value = "/register")
public class RegisterController {

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 注册普通用户
     *
     * @param username 用户名
     * @param password 密码
     * @return ResponseUtils
     */
    @RequestMapping(value = "/user")
    public ResponseUtils user(String username, String password) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(username);
        sysUser.setPassword(bCryptPasswordEncoder.encode(password));
        sysUser.setStatus("0");
        sysUserService.save(sysUser);

        // 将其设置为普通用户权限
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setUserId(sysUser.getId());
        sysUserRole.setRoleId(2L);
        sysUserRoleService.save(sysUserRole);

        return ResponseUtils.success(sysUser);
    }
}