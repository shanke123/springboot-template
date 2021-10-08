package com.smart.plumemo_template.plumemo.category.controller;

import com.smart.plumemo_template.common.base.domain.Result;
import com.smart.plumemo_template.common.util.ThrowableUtils;
import com.smart.plumemo_template.common.validator.group.Insert;
import com.smart.plumemo_template.common.validator.group.Update;
import com.smart.plumemo_template.plumemo.category.domain.vo.TagsVO;
import com.smart.plumemo_template.plumemo.category.service.TagsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @GetMapping("/tags/v1/list")
    public Result getTagsList(TagsVO tagsVO) {
        return this.tagsService.getTagsList(tagsVO);
    }


    @PostMapping("/tags/v1/add")
    public Result saveTags(@Validated({Insert.class}) @RequestBody TagsVO tagsVO, BindingResult result) {

        ThrowableUtils.checkParamArgument(result);
        return Result.createWithModel("test");
    }

/*    @GetMapping("/tags/v1/{id}")
    public Result getTags(@PathVariable Long id) {
        return this.tagsService.getTags(id);
    }

    //@LoginRequired
    @PostMapping("/tags/v1/add")
    public Result saveTags(@Validated({Insert.class}) @RequestBody TagsVO tagsVO, BindingResult result) {
        ThrowableUtils.checkParamArgument(result);
        return this.tagsService.saveTags(tagsVO);
    }

    //@LoginRequired
    @PutMapping("/tags/v1/update")
    public Result updateTags(@Validated({Update.class}) @RequestBody TagsVO tagsVO, BindingResult result) {
        ThrowableUtils.checkParamArgument(result);
        return this.tagsService.updateTags(tagsVO);
    }

    //@LoginRequired
    @DeleteMapping("/tags/v1/{id}")
    public Result updateTags(@PathVariable Long id) {
        return this.tagsService.deleteTags(id);
    }*/
}
