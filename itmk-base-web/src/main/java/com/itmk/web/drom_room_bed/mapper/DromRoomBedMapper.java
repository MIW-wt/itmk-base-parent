package com.itmk.web.drom_room_bed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmk.web.drom_room_bed.entity.DromRoomBed;
import com.itmk.web.drom_room_bed.entity.DromRoomVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DromRoomBedMapper extends BaseMapper<DromRoomBed> {
     List<DromRoomBed> getBedList(@Param("roomId") Long roomId);
     List<DromRoomVo> getSelectBedList(@Param("roomId") Long roomId);
}
