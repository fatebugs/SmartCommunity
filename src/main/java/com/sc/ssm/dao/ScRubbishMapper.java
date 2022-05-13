package com.sc.ssm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sc.ssm.domain.ScRubbish;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.sc.ssm.domain.ScRubbish
 */
public interface ScRubbishMapper extends BaseMapper<ScRubbish> {

    @Select("select r.rubbish_id `rubbish_id`,r.rubbish_name `rubbish_name`,c.classification_id `classification_id`,c.classification_name `classification_name` from sc_rubbish r,sc_classification c where r.rubbish_fyid=c.classification_id")
    List<Map<String, Object>> findAll();

}




