package com.itmk.web.sys_role.entity;

import lombok.Data;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class SaveRoleParm {
    //角色id
    private Long roleId;
    //菜单的id
    private List<Long> list;
}
