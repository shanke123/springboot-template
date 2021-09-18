package com.smart.plumemo_template.plumemo.category.controller;

import com.smart.plumemo_template.common.base.domain.Result;
import com.smart.plumemo_template.plumemo.category.domain.vo.TagsVO;
import com.smart.plumemo_template.plumemo.category.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author byteblogs
 * @since 2019-08-28
 */
@RestController
@RequestMapping("/tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @GetMapping("/tags/v1/list")
    public Result getTagsList(TagsVO tagsVO) {
        return this.tagsService.getTagsList(tagsVO);
    }

}
