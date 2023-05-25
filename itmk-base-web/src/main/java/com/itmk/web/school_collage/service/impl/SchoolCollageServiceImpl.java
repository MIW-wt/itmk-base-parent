package com.itmk.web.school_collage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.itmk.web.school_collage.entity.SchoolCollage;
import com.itmk.web.school_collage.mapper.SchoolCollageMapper;
import com.itmk.web.school_collage.service.SchoolCollageService;
import org.springframework.stereotype.Service;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Service
public class SchoolCollageServiceImpl extends ServiceImpl<SchoolCollageMapper, SchoolCollage> implements SchoolCollageService {
    @Override
    public boolean deleteByCollegeId(Long collageId) {
        return SqlHelper.retBool(this.baseMapper.deleteByCollegeId(collageId));
    }
}
