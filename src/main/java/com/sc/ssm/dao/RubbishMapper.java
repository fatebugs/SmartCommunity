package com.sc.ssm.dao;

import com.sc.ssm.pojo.Rubbish;
import com.sc.ssm.pojo.RubbishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RubbishMapper {
    long countByExample(RubbishExample example);

    int deleteByExample(RubbishExample example);

    int deleteByPrimaryKey(Integer rubbishId);

    int insert(Rubbish record);

    int insertSelective(Rubbish record);

    List<Rubbish> selectByExample(RubbishExample example);

    Rubbish selectByPrimaryKey(Integer rubbishId);

    int updateByExampleSelective(@Param("record") Rubbish record, @Param("example") RubbishExample example);

    int updateByExample(@Param("record") Rubbish record, @Param("example") RubbishExample example);

    int updateByPrimaryKeySelective(Rubbish record);

    int updateByPrimaryKey(Rubbish record);
}
