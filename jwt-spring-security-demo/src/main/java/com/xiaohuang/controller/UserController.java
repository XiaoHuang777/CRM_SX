package com.xiaohuang.controller;

import com.xiaohuang.entity.SysUser;
import com.xiaohuang.service.SysUserService;
import com.xiaohuang.utils.ResponseUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xiaohuang.security.entity.SysUserDetails;

import javax.annotation.Resource;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:19
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     *
     * @return ResponseUtils
     */
    @PreAuthorize(value = "hasPermission('/user/info', 'sys:user:info')")
    @RequestMapping(value = "/info")
    public ResponseUtils info() {
        SysUserDetails sysUserDetails = (SysUserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        SysUser sysUser = sysUserService.getById(sysUserDetails.getId());
        return ResponseUtils.success(sysUser);
    }

}