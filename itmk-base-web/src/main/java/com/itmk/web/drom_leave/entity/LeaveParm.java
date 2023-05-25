package com.itmk.web.drom_leave.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class LeaveParm {
    private String classes;
    private String stuName;
    private String dromName;
    private Long currentPage;
    private Long pageSize;
}
