package com.example.blogapiapplication.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: BlogApiApplication
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-07 16:30
 **/
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}