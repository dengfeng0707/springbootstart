package com.dfliu.shirodemo.shirodemo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * df_user_info
 * @author 
 */
@Data
public class DfUserInfoEntity implements Serializable {
    /**
     * 自增主键id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户状态
     */
    private Integer deleted;

    private static final long serialVersionUID = 1L;
}