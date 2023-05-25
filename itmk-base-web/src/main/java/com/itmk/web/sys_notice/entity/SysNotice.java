package com.itmk.web.sys_notice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
@TableName("sys_notice")
public class SysNotice {
    @TableId(type = IdType.AUTO)
    private Long noticeId;
    private String noticeTitle;
    private String noticeText;
    private String types;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
}
