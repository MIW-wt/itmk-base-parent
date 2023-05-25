package com.itmk.web.drom_build.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class BuildEcharts {
    private List<String> names = new ArrayList<>();
    private List<Integer> counts = new ArrayList<>();
}
