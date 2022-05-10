package com.sc.ssm.server;

import com.sc.ssm.dao.VaccinationMapper;
import com.sc.ssm.pojo.Vaccination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FuXinSha
 * @create 2022/4/22 18:07
 **/
@Service
public class VaccinationService {
    @Autowired
    VaccinationMapper vaccinationMapper;

    public void save(Vaccination vaccination) {
        Vaccination v = vaccinationMapper.selectByPrimaryKey(vaccination.getVaccinationId());
        if (v==null || v.equals(" ")) {
            vaccinationMapper.insertSelective(vaccination);
        }else{
            vaccinationMapper.updateByPrimaryKeySelective(vaccination);
        }
    }
}
