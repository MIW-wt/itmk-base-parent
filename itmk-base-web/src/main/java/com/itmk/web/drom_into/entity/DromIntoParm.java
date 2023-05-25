package com.itmk.web.drom_into.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class DromIntoParm {
    private String name;
    private String userName;
    private Long currentPage;
    private Long pageSize;
}
