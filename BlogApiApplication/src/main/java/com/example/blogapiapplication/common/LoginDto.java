package com.example.blogapiapplication.common;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @program: BlogApiApplication
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-07 17:48
 **/
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}