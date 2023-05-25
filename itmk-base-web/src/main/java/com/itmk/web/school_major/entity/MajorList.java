package com.itmk.web.school_major.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class MajorList {
    private String majorName;
    private String collageName;
    private Long currentPage;
    private Long pageSize;
}
