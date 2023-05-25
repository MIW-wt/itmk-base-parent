package com.itmk.web.drom_room_bed.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.drom_room_bed.entity.DromRoomBed;
import com.itmk.web.drom_room_bed.entity.DromRoomVo;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DromRoomBedService extends IService<DromRoomBed> {
     List<DromRoomBed> getBedList(Long roomId);
      List<DromRoomVo> getSelectBedList(Long roomId);
}
