package com.itmk.web.school_class.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.school_class.entity.AssignClass;
import com.itmk.web.school_class.entity.AssignClassParm;
import com.itmk.web.school_class.entity.ListParm;
import com.itmk.web.school_class.entity.SchoolClass;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SchoolClassService extends IService<SchoolClass> {
     SchoolClass getSchoolClassById(Long classId);
      //查询列表
    IPage<SchoolClass> getList(ListParm parm);
    //分配宿舍，查询班级列表
    IPage<AssignClass> getAssignClass(AssignClassParm parm);

    boolean deleteByClassId(Long classId);
}
