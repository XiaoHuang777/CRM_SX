package com.xiaohuang.security.handler;

import com.xiaohuang.utils.ResponseUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import com.xiaohuang.security.entity.SysUserDetails;
import com.xiaohuang.security.utils.JwtTokenUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:10
 **/
@Component
public class MyLoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) {
        SysUserDetails sysUserDetails = (SysUserDetails) authentication.getPrincipal();
        String token = JwtTokenUtil.createAccessToken(sysUserDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        ResponseUtils.responseJson(response, ResponseUtils.response(200, "登录成功", tokenMap));
    }
}