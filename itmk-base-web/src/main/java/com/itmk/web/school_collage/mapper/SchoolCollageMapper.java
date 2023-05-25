package com.itmk.web.school_collage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.school_collage.entity.SchoolCollage;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface SchoolCollageMapper extends BaseMapper<SchoolCollage> {
    int deleteByCollegeId(Long collageId);
}
