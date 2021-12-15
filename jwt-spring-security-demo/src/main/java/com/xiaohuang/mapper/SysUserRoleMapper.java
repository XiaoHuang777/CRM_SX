package com.xiaohuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.xiaohuang.entity.SysUserRole;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:39
 **/
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}
