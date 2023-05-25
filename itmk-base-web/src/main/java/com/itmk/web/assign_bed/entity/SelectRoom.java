package com.itmk.web.assign_bed.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class SelectRoom {
    private Long roomId;
    private Long classId;
    private String roomCode;
    private String rootType;
    private String className;
    private List<SelectBed> children = new ArrayList<>();
}
