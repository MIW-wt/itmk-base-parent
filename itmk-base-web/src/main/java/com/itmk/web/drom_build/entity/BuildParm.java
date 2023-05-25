package com.itmk.web.drom_build.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class BuildParm {
    private String buildName;
    private Long currentPage;
    private Long pageSize;
}
