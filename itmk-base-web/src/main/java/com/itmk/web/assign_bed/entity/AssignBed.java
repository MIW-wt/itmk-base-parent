package com.itmk.web.assign_bed.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
@TableName("assign_bed")
public class AssignBed {
    private Long assignId;
    private Long bedId;
    private Long classId;
}
