package com.itmk.web.school_major.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.school_major.entity.MajorList;
import com.itmk.web.school_major.entity.SchoolMajor;


/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SchoolMajorService extends IService<SchoolMajor> {
    IPage<SchoolMajor> getList(MajorList majorList);

    boolean deleteByMajorId(Long majorId);
}
