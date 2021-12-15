package com.xiaohuang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaohuang.mapper.SysUserMapper;
import com.xiaohuang.service.SysUserService;
import org.springframework.stereotype.Service;
import com.xiaohuang.entity.SysAuth;
import com.xiaohuang.entity.SysRole;
import com.xiaohuang.entity.SysUser;

import java.util.List;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:15
 **/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    /**
     * 根据用户名称查询用户信息
     *
     * @param username 用户名称
     * @return SysUser 系统用户
     */
    @Override
    public SysUser findUserByUserName(String username) {
        return this.baseMapper.selectOne(
                new QueryWrapper<SysUser>().lambda().eq(SysUser::getUsername, username).ne(SysUser::getStatus, "1"));
    }

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    @Override
    public List<SysRole> findRoleByUserId(Long userId) {
        return this.baseMapper.findRoleByUserId(userId);
    }

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    @Override
    public List<SysAuth> findAuthByUserId(Long userId) {
        return this.baseMapper.findAuthByUserId(userId);
    }

}