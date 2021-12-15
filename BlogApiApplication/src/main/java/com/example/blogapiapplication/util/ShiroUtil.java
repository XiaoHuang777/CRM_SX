package com.example.blogapiapplication.util;

import org.apache.shiro.SecurityUtils;
import com.example.blogapiapplication.shiro.AccountProfile;

/**
 * @program: BlogApiApplication
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-07 16:27
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}