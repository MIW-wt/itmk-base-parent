package com.itmk.web.drom_look.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class LookParm {
     private String lookRoom;
    private String userName;
    private Long currentPage;
    private Long pageSize;
}
