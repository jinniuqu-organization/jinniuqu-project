package com.kxj.bigscreen.service;

import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/27 14:44
 * @Version 1.0
 */
public interface OperationNewService {

    HashMap findStandard();

    List<Datamonitor1Application> application();

    List<Datamonitor2Tansform> transform();

    List<TransformManage> manage(Datamonitor2Tansform datamonitor2Tansform);
    List<Datamonitor2StandardService> service();
}
