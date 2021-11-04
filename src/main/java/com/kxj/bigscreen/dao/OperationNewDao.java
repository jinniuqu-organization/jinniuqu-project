package com.kxj.bigscreen.dao;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;

import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:43
 * @Version 1.0
 */
public interface OperationNewDao {



    List<StandardMonitor> findClean();
    List<StandardMonitor> findOptimization();
    List<StandardMonitor> findStandard();
    List<StandardMonitor> findFuse();

    List<Datamonitor1Application> application();

    List<Datamonitor2Tansform> transform();

    List<TransformManage> manage(Datamonitor2Tansform datamonitor2Tansform);

    List<Datamonitor2StandardService> service();

}
