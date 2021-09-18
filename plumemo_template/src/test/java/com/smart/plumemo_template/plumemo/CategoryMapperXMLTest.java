package com.smart.plumemo_template.plumemo;

import com.smart.plumemo_template.demo.mybatisplusindex.domain.po.MpUserPojo;
import com.smart.plumemo_template.plumemo.category.dao.TagsDao;
import com.smart.plumemo_template.plumemo.category.domain.po.Tags;
import com.smart.plumemo_template.plumemo.category.service.TagsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class CategoryMapperXMLTest {

    @Autowired
    private TagsDao tagsDao;

    @Test
    public void create() {
        Tags tags = new Tags();
        tags.setId(6l);

        tags.setName("张三");
        tags.setSort(1);
        tags.setCreateTime(LocalDateTime.now());
        tags.setCreateBy(1l);
        //tags.setUpdateBy(null);
        tags.setUpdateTime(LocalDateTime.now());

        //Mybatis Mapper模式
        //int insert = tagsDao.insert(tags);

        //ActiveRecord模式
        boolean insert = tags.insertOrUpdate();

        System.out.println(insert);
        System.out.println(tags);
    }

    @Test
    public void select() {
        Tags tags = new Tags();
        tags.setId(1L);
        Tags tags1 = tags.selectById();
        System.out.println(tags1);
    }
}
