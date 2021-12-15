package com.xiaohuang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program: api-project-template
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-15 08:02
 **/
@Data
@TableName(value = "blade_notice")
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String tenantId;

    private String title;

    private Integer category;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime releaseTime;

    private String content;

    private Long createUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    private Long updateUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    private Integer status;

    private Integer isDeleted;
}