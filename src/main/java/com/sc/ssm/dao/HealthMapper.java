package com.sc.ssm.dao;

import com.sc.ssm.pojo.Health;
import com.sc.ssm.pojo.HealthExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface HealthMapper {
    long countByExample(HealthExample example);

    int deleteByExample(HealthExample example);

    int deleteByPrimaryKey(@Param("healthId") Date healthId, @Param("healthIds") String healthIds);

    int insert(Health record);

    int insertSelective(Health record);

    List<Health> selectByExample(HealthExample example);

    Health selectByPrimaryKey(@Param("healthId") Date healthId, @Param("healthIds") String healthIds);

    int updateByExampleSelective(@Param("record") Health record, @Param("example") HealthExample example);

    int updateByExample(@Param("record") Health record, @Param("example") HealthExample example);

    int updateByPrimaryKeySelective(Health record);

    int updateByPrimaryKey(Health record);

    List<Health> selectAllById(int id);

    List<Health> selectByTemperature(@Param("temperature") Integer temperature);
}
