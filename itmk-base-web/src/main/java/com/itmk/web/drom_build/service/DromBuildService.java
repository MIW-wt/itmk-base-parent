package com.itmk.web.drom_build.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.drom_build.entity.BuildEcharts;
import com.itmk.web.drom_build.entity.DromBuild;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
public interface DromBuildService extends IService<DromBuild> {
    //新增
    void addBuild(DromBuild dromBuild);
    BuildEcharts getListBuild();
}
