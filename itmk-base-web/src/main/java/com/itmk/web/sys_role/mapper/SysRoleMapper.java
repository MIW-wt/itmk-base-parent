package com.itmk.web.sys_role.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.sys_role.entity.SysRole;

public interface SysRoleMapper extends BaseMapper<SysRole> {
    int deleteByRoleId(Long roleId);
}
