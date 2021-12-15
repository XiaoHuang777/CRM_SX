package com.xiaohuang.security.handler;

import com.xiaohuang.utils.ResponseUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: jwt-spring-security-demo
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-13 18:10
 **/
@Component
public class MyLoginFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) {
        ResponseUtils.responseJson(response, ResponseUtils.response(500, "登录失败", exception.getMessage()));
    }
}