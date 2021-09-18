package com.smart.plumemo_template.plumemo.category.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smart.plumemo_template.common.base.domain.Result;
import com.smart.plumemo_template.demo.mybatisplusindex.domain.po.MpUserPojo;
import com.smart.plumemo_template.plumemo.category.dao.TagsDao;
import com.smart.plumemo_template.plumemo.category.domain.po.Tags;
import com.smart.plumemo_template.plumemo.category.domain.vo.TagsVO;
import com.smart.plumemo_template.plumemo.category.service.TagsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagsServiceImpl  extends ServiceImpl<TagsDao, Tags> implements TagsService {

    @Autowired
    private TagsDao tagsDao;

    @Override
    public Result getTagsList(TagsVO tagsVO) {
        List<TagsVO> tagsList = new ArrayList<>();
        if (tagsVO == null || tagsVO.getPage() == null || tagsVO.getSize() == null) {
            List<Tags> records = this.tagsDao.selectList(new LambdaQueryWrapper<Tags>().orderByDesc(Tags::getId));
            if(!CollectionUtils.isEmpty(records)){
                records.forEach(tags -> {
                    tagsList.add(new TagsVO().setId(tags.getId()).setName(tags.getName()));
                });
            }

        }
        return Result.createWithModels(tagsList);

    }
}
