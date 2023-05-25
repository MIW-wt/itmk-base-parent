package com.itmk.web.dorm_room.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.dorm_room.entity.DormRoom;
import com.itmk.web.dorm_room.entity.RoomTree;

import java.util.List;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DormRoomService extends IService<DormRoom> {
     List<RoomTree> getRoomTree(Long storeyId);
}
