package com.xiaohuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohuang.entity.SysAuth;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:39
 **/
@Mapper
public interface SysAuthMapper extends BaseMapper<SysAuth> {
}
