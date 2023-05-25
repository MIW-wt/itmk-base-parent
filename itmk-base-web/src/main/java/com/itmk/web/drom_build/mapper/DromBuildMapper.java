package com.itmk.web.drom_build.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.drom_build.entity.BuildVo;
import com.itmk.web.drom_build.entity.DromBuild;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DromBuildMapper extends BaseMapper<DromBuild> {
    List<BuildVo> getListBuild();
}
