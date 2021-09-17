package com.smart.plumemo_template.demo.mybatisplusindex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smart.plumemo_template.demo.mybatisplusindex.dao.MpUserMapper;
import com.smart.plumemo_template.demo.mybatisplusindex.domain.po.MpUserPojo;
import com.smart.plumemo_template.demo.mybatisplusindex.service.MpUserService;
import org.springframework.stereotype.Service;

@Service
public class MpUserServiceImpl extends ServiceImpl<MpUserMapper, MpUserPojo> implements MpUserService {
}
