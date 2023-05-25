package com.itmk.web.select_bed.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class StuBedVo {
    private Long stuId;
    private Long bedId;
    private Long roomId;
    private String roomCode;
    private String rootType;
    private String bedCode;
    private String storeyName;
    private String buildName;
    private String stuName;
    private String className;
}
