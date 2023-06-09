package com.itmk.web.dorm_room.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class RoomParm {
    private String area;
    private Integer start;
    private Integer end;
    private Integer stuNum;
    private Long storeyId;
     private String rootType;
}
