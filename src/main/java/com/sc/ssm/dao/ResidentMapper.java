package com.sc.ssm.dao;

import com.sc.ssm.pojo.Resident;
import com.sc.ssm.pojo.ResidentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResidentMapper {
    long countByExample(ResidentExample example);

    int deleteByExample(ResidentExample example);

    int deleteByPrimaryKey(Integer residentsId);

    int insert(Resident record);

    int insertSelective(Resident record);

    List<Resident> selectByExample(ResidentExample example);

    Resident selectByPrimaryKey(Integer residentsId);

    int updateByExampleSelective(@Param("record") Resident record, @Param("example") ResidentExample example);

    int updateByExample(@Param("record") Resident record, @Param("example") ResidentExample example);

    int updateByPrimaryKeySelective(Resident record);

    int updateByPrimaryKey(Resident record);

    List<Resident> selectAll();

    List<Integer> queryAllResidentId();
}
