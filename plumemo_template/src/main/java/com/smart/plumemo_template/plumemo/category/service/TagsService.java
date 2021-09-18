package com.smart.plumemo_template.plumemo.category.service;

import com.smart.plumemo_template.common.base.domain.Result;
import com.smart.plumemo_template.plumemo.category.domain.vo.TagsVO;

public interface TagsService {
    Result getTagsList(TagsVO tagsVO);
}
