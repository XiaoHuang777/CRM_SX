package com.xiaohuang.security.handler;

import com.xiaohuang.service.SysUserService;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import com.xiaohuang.entity.SysAuth;
import com.xiaohuang.security.entity.SysUserDetails;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:17
 **/
@Component
public class MyPermissionEvaluator implements PermissionEvaluator {

    @Resource
    private SysUserService sysUserService;

    /**
     * 判断是否拥有权限
     *
     * @param authentication 用户身份
     * @param targetUrl      目标路径
     * @param permission     路径权限
     * @return 是否拥有权限
     */
    @Override
    public boolean hasPermission(Authentication authentication, Object targetUrl, Object permission) {
        SysUserDetails sysUserDetails = (SysUserDetails) authentication.getPrincipal();
        // 用户权限
        Set<String> permissions = new HashSet<>();

        List<SysAuth> authList = sysUserService.findAuthByUserId(sysUserDetails.getId());
        authList.forEach(auth -> {
            permissions.add(auth.getPermission());
        });

        // 判断是否拥有权限
        return permissions.contains(permission.toString());
    }

    @Override
    public boolean hasPermission(Authentication authentication,
                                 Serializable targetId,
                                 String targetType,
                                 Object permission) {
        return false;
    }

}