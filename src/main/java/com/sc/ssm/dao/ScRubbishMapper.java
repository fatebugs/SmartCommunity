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

    @Select("select r.rubbish_id `rubbishId`,r.rubbish_name `rubbishName`,c.classification_id `classificationId`,c.classification_name `classificationName` from sc_rubbish r,sc_classification c where r.rubbish_fyid=c.classification_id")
    List<Map<String, Object>> findAll();

}




