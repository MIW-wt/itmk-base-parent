package com.itmk.web.drom_room_bed.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class DromRoomVo {
    private Long bedId;
    private Long roomId;
    private Long stuId;
    private String bedCode;
    private String stuName;
    private String className;
}
