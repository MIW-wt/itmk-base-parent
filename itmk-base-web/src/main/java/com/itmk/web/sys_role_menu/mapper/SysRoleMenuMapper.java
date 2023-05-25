package com.itmk.web.sys_role_menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.sys_role_menu.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {
    boolean saveRoleMenu(@Param("roleId") Long roleId,@Param("menuIds") List<Long> menuIds);

    int insertAddMenuId();
}
