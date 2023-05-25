package com.itmk.web.drom_storey.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.drom_storey.entity.DromStorey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DromStoreyMapper extends BaseMapper<DromStorey> {
    //新增
    void addDrom(@Param("list")List<DromStorey> list);
}
