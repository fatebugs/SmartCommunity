package com.sc.ssm.dao;

import com.sc.ssm.domain.ScClassification;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.sc.ssm.domain.ScClassification
 */
public interface ScClassificationMapper extends BaseMapper<ScClassification> {

    @Select("select classification_id,classification_name from smartcommunity.sc_classification group by classification_id ;")
    List<Map<String ,Object>> selectAllId();
}




