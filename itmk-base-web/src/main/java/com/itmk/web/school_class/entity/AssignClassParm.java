package com.itmk.web.school_class.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class AssignClassParm {
    private Long currentPage;
    private Long pageSize;
    private String className;
    private String classYear;
}
