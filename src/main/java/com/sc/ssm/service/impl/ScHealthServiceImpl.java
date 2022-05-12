package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScHealth;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScHealthService;
import com.sc.ssm.dao.ScHealthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScHealthServiceImpl extends ServiceImpl<ScHealthMapper, ScHealth>
implements ScHealthService{

    @Autowired
    private ScHealthMapper scHealthMapper;

    @Override
    public PageInfo<ScHealth> findSHS(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScHealth> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScHealth> list = scHealthMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




