package com.smart.plumemo_template.common.base.domain;

import com.smart.plumemo_template.common.constant.Constants;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PageInfo {

    private long page = Constants.DEFAULT_PAGE_INDEX;
    private long size = Constants.DEFAULT_PAGE_SIZE;
    private Long total;
}
