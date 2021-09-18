package com.smart.plumemo_template.plumemo.category.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author byteblogs
 * @since 2019-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("plumemo_tags")
public class Tags  extends Model<Tags> {

    private static final long serialVersionUID = 1L;

    /**
     * value”：设置数据库字段值
     * “type”：设置主键类型、如果数据库主键设置了自增建议使用“AUTO”
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer sort;
    private LocalDateTime createTime;
    private Long createBy;
    private LocalDateTime updateTime;
    private Long updateBy;

    //重写这个方法，return当前类的主键
    //在实际的实践中，发现如果未重写pkVal()方法，并不会影响AR的使用
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
