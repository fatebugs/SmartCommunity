package com.sc.ssm.dao;

import com.sc.ssm.pojo.Classification;
import com.sc.ssm.pojo.ClassificationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassificationMapper {
    long countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(Integer classificationId);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(Integer classificationId);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);

    List<Classification> getAll();
}
