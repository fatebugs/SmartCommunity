package com.sc.ssm.dao;

import com.sc.ssm.pojo.Vaccination;
import com.sc.ssm.pojo.VaccinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VaccinationMapper {
    long countByExample(VaccinationExample example);

    int deleteByExample(VaccinationExample example);

    int deleteByPrimaryKey(Integer vaccinationId);

    int insert(Vaccination record);

    int insertSelective(Vaccination record);

    List<Vaccination> selectByExample(VaccinationExample example);

    Vaccination selectByPrimaryKey(Integer vaccinationId);

    int updateByExampleSelective(@Param("record") Vaccination record, @Param("example") VaccinationExample example);

    int updateByExample(@Param("record") Vaccination record, @Param("example") VaccinationExample example);

    int updateByPrimaryKeySelective(Vaccination record);

    int updateByPrimaryKey(Vaccination record);
}
