package com.ixc.xcbibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ixc.xcbibackend.bizmq.BiMessageProducer;
import com.ixc.xcbibackend.common.ErrorCode;
import com.ixc.xcbibackend.exception.ThrowUtils;
import com.ixc.xcbibackend.manager.RedisLimiterManager;
import com.ixc.xcbibackend.model.entity.Chart;
import com.ixc.xcbibackend.model.entity.User;
import com.ixc.xcbibackend.service.ChartService;
import com.ixc.xcbibackend.mapper.ChartMapper;
import com.ixc.xcbibackend.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
* @author hong
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

    @Resource
    private BiMessageProducer biMessageProducer;

    @Resource
    private UserService userService;

    @Resource
    private RedisLimiterManager redisLimiterManager;

    @Override
    public boolean reloadChartByAi(long chartId, HttpServletRequest request) {
        ThrowUtils.throwIf(chartId < 0, ErrorCode.PARAMS_ERROR);
        User loginUser = userService.getLoginUser(request);
        final String key = "getChartByAi_" + loginUser.getId();
        // 限流判断
        redisLimiterManager.doRateLimit(key);
        //发送消息
        biMessageProducer.sendMessage(String.valueOf(chartId));
        return true;
    }

}




