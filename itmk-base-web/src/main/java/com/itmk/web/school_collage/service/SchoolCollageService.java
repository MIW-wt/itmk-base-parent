package com.itmk.web.school_collage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.school_collage.entity.SchoolCollage;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SchoolCollageService extends IService<SchoolCollage> {
    boolean deleteByCollegeId(Long collageId);
}




