package com.itmk.web.sys_role_menu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.itmk.utils.ResultUtils;
import com.itmk.web.sys_role_menu.entity.SysRoleMenu;
import com.itmk.web.sys_role_menu.mapper.SysRoleMenuMapper;
import com.itmk.web.sys_role_menu.service.SysRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    @Override
    public Boolean insertAddMenuId() {
        return SqlHelper.retBool(this.baseMapper.insertAddMenuId());
    }

    @Override
    @Transactional
    public void saveRoleMenu(Long roleId, List<Long> menuIds) {
        //思路：先删除角色原来id，重新插入
        QueryWrapper<SysRoleMenu> qeury = new QueryWrapper<>();
        qeury.lambda().eq(SysRoleMenu::getRoleId,roleId);
        //删除
        this.baseMapper.delete(qeury);
//            System.out.println(menuIds);
        //插入
        //判断菜单id是否为空，如果为空则不做saveRoleMenu操作
        if (menuIds.isEmpty()){
            System.out.println("数组为空");
        }else {
            System.out.println("数组内容："+menuIds);
            this.baseMapper.saveRoleMenu(roleId,menuIds);
        }
    }
}
