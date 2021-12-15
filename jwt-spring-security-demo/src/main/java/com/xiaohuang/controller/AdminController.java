package com.xiaohuang.controller;

import com.xiaohuang.entity.SysRole;
import com.xiaohuang.entity.SysUser;
import com.xiaohuang.service.SysUserService;
import com.xiaohuang.utils.ResponseUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xiaohuang.entity.SysAuth;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:19
 **/
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     *
     * @return ResponseUtils
     */
    @PreAuthorize(value = "hasRole('ADMIN')")
    @RequestMapping(value = "/list")
    public ResponseUtils list() {
        List<SysUser> userList = sysUserService.list();
        return ResponseUtils.success(userList);
    }

    /**
     * 查询用户角色
     *
     * @return ResponseUtils
     */
    @PreAuthorize(value = "hasRole('ADMIN') or hasPermission('/user/role', 'sys:role:info')")
    @RequestMapping(value = "/role")
    public ResponseUtils role(Long id) {
        List<SysRole> roleList = sysUserService.findRoleByUserId(id);
        return ResponseUtils.success(roleList);
    }

    /**
     * 查询用户权限
     *
     * @return ResponseUtils
     */
    @PreAuthorize(value = "hasAnyRole('ADMIN', 'USER') and hasPermission('/user/auth', 'sys:auth:info')")
    @RequestMapping(value = "/auth")
    public ResponseUtils auth(Long id) {
        List<SysAuth> authList = sysUserService.findAuthByUserId(id);
        return ResponseUtils.success(authList);
    }

}