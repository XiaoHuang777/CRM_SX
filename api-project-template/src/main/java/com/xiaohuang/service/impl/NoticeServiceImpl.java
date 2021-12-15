package com.xiaohuang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaohuang.entity.Notice;
import com.xiaohuang.mapper.NoticeMapper;
import com.xiaohuang.service.NoticeService;
import org.springframework.stereotype.Service;

/**
 * @program: api-project-template
 * @description:
 * @author: XiaoHuang
 * @create: 2021-12-15 08:03
 **/
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

}