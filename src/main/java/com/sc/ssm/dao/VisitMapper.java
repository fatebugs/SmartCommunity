package com.sc.ssm.dao;

import com.sc.ssm.pojo.Visit;
import com.sc.ssm.pojo.VisitExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface VisitMapper {
    long countByExample(VisitExample example);

    int deleteByExample(VisitExample example);

    int deleteByPrimaryKey(@Param("visitId") Date visitId, @Param("visitIds") String visitIds);

    int insert(Visit record);

    int insertSelective(Visit record);

    List<Visit> selectByExample(VisitExample example);

    Visit selectByPrimaryKey(@Param("visitId") Date visitId, @Param("visitIds") String visitIds);

    int updateByExampleSelective(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByExample(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);

    List<Visit> selectAllById(int id);
}
