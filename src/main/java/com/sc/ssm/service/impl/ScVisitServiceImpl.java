package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.ScVisitMapper;
import com.sc.ssm.domain.ScVisit;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScVisitServiceImpl extends ServiceImpl<ScVisitMapper, ScVisit>
implements ScVisitService{
    @Autowired
    private ScVisitMapper scVisitMapper;
    @Override
    public PageInfo<ScVisit> findSvcUser(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScVisit> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }
        queryWrapper.eq("visit_external",0);
        List<ScVisit> list = scVisitMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<ScVisit> findSvcExternal(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScVisit> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }
        queryWrapper.eq("visit_external",1);
        List<ScVisit> list = scVisitMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




