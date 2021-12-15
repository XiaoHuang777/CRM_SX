package com.xiaohuang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaohuang.entity.SysAuth;
import com.xiaohuang.entity.SysRole;
import com.xiaohuang.entity.SysUser;

import java.util.List;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:14
 **/
public interface SysUserService extends IService<SysUser> {

    /**
     * 根据用户名称查询用户信息
     *
     * @param username 用户名称
     * @return SysUser 系统用户
     */
    SysUser findUserByUserName(String username);

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    List<SysRole> findRoleByUserId(Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    List<SysAuth> findAuthByUserId(Long userId);

}