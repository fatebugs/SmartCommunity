package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScOrder;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScOrderService;
import com.sc.ssm.dao.ScOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScOrderServiceImpl extends ServiceImpl<ScOrderMapper, ScOrder>
implements ScOrderService{
    @Autowired
    private ScOrderMapper scOrderMapper;

    @Override
    public PageInfo<ScOrder> findSov(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScOrder> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScOrder> list = scOrderMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




