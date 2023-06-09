package com.itmk.web.school_student.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class StuParm {
    private String classId;
    private String collageId;
    private String majorId;
    private String stuName;
    private String className;
    private String majorName;
    private String collageName;
    private Long currentPage;
    private Long pageSize;
}
