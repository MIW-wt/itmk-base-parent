package com.itmk.web.drom_repair.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class RepairParm {
    private String dromName;
    private Long currentPage;
    private Long pageSize;
}
