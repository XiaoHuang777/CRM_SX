package com.xiaohuang.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:32
 **/
@Data
@TableName("sys_role_auth")
public class SysRoleAuth implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

    /**
     * 权限ID
     */
    private Long authId;
}
