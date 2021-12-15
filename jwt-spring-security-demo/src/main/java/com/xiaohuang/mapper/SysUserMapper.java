package com.xiaohuang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohuang.entity.SysAuth;
import com.xiaohuang.entity.SysRole;
import com.xiaohuang.entity.SysUser;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 14:43
 **/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return List<SysRole>
     */
    List<SysRole> findRoleByUserId(Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return List<SysAuth>
     */
    List<SysAuth> findAuthByUserId(Long userId);
}
