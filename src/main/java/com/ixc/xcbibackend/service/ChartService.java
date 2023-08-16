package com.ixc.xcbibackend.service;

import com.ixc.xcbibackend.model.entity.Chart;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author hong
* @description 针对表【chart(图表信息表)】的数据库操作Service
*/
public interface ChartService extends IService<Chart> {

    /**
     * 手动重试 AI 生成图表
     *
     * @param chartId 图表id
     * @param request
     * @return boolean
     */
    boolean reloadChartByAi(long chartId, HttpServletRequest request);

}
