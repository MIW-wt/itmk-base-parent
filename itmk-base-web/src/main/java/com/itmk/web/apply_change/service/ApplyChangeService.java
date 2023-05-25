package com.itmk.web.apply_change.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.apply_change.entity.ApplyChange;
import com.itmk.web.apply_change.entity.ApplyDoParm;
import com.itmk.web.apply_change.entity.ApplyParm;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface ApplyChangeService extends IService<ApplyChange> {
     void applySave(ApplyParm parm);
     void applyDo(ApplyDoParm change);
}
