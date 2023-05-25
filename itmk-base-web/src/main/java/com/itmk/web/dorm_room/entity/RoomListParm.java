package com.itmk.web.dorm_room.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class RoomListParm {
    private Long currentPage;
    private Long pageSize;
    private Long storeyId;
}
