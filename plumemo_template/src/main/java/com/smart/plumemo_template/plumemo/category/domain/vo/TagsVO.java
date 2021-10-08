package com.smart.plumemo_template.plumemo.category.domain.vo;

import com.smart.plumemo_template.common.base.domain.vo.BaseVO;
import com.smart.plumemo_template.common.validator.group.Insert;
import com.smart.plumemo_template.common.validator.group.Update;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Accessors(chain = true)
public class TagsVO extends BaseVO<TagsVO> {
    /**
     * 名称
     */
    //
    //@NotBlank(groups = {Insert.class, Update.class})
    //@NotBlank(message="名称不为空")
    @NotBlank(groups = {Insert.class, Update.class})
    private String name;

    /**
     * 文章总数
     */
    private Integer postsTotal;

}
