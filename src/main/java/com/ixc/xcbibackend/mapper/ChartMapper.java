package com.ixc.xcbibackend.mapper;

import com.ixc.xcbibackend.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author hong
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
*/
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String, Object>> queryChartData(String querySql);

}




