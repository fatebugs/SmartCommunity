package com.sc.ssm.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.HealthMapper;
import com.sc.ssm.pojo.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/16 22:03
 **/
@Service
public class HealthService {

    @Autowired
    HealthMapper healthMapper;

    public PageInfo<Health> getAll(int id, int page, int row) {
        PageHelper.startPage(page,row);
        List<Health> healthList= healthMapper.selectAllById(id);
        PageInfo<Health> healthPageInfo = new PageInfo<>(healthList, 3);
        return healthPageInfo;

    }

    public void save(Health health) {
        Health h = healthMapper.selectByPrimaryKey(health.getHealthId(), health.getHealthIds());
        if (h==null || h.equals(" ")) {
            healthMapper.insertSelective(health);
        }else{
            healthMapper.updateByPrimaryKeySelective(health);
        }
    }

    public PageInfo<Health> qeuryTemperature(int page, int row) {
        PageHelper.startPage(page,row);
        List <Health> healthList = healthMapper.selectByTemperature(38);
        PageInfo<Health> healthPageInfo = new PageInfo<>(healthList,3);
        return healthPageInfo;
    }
}
