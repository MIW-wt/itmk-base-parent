package com.itmk.web.select_bed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.select_bed.entity.ChangeStu;
import com.itmk.web.select_bed.entity.StuBed;
import com.itmk.web.select_bed.entity.StuBedVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface StuBedMapper extends BaseMapper<StuBed> {
    List<StuBedVo> getStuBedList(@Param("stuId") Long stuId);
    List<ChangeStu> getStuList(@Param("classId") Long classId);
}
