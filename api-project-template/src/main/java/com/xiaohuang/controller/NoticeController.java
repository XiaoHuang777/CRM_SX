package com.xiaohuang.controller;

import com.xiaohuang.entity.Notice;
import com.xiaohuang.service.NoticeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: api-project-template
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-15 08:04
 **/
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    @GetMapping("/list")
    public List<Notice> selectAll() {
        return noticeService.list();
    }

}