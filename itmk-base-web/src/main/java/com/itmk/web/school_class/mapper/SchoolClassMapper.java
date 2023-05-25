package com.itmk.web.school_class.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itmk.web.school_class.entity.AssignClass;
import com.itmk.web.school_class.entity.AssignClassParm;
import com.itmk.web.school_class.entity.ListParm;
import com.itmk.web.school_class.entity.SchoolClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SchoolClassMapper extends BaseMapper<SchoolClass> {
    //编辑回显
    SchoolClass getSchoolClassById(@Param("classId") Long classId);
    //查询列表
    IPage<SchoolClass> getList(IPage<SchoolClass> page, @Param("parm")ListParm parm);
    //分配宿舍，查询班级列表
    IPage<AssignClass> getAssignClass(IPage<AssignClass> page,@Param("parm") AssignClassParm parm);

    int deleteByClassId(Long classId);
}
