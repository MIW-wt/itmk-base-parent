package com.itmk.web.sys_role_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.sys_role_menu.entity.SysRoleMenu;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {
    void saveRoleMenu(Long roleId, List<Long> menuIds);

    Boolean insertAddMenuId();
}
