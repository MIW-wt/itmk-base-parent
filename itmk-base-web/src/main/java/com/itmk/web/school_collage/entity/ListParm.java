package com.itmk.web.school_collage.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class ListParm {
    private Long currentPage;
    private Long pageSize;
    private String collageName;
}
