package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScCloseContacts;
import com.sc.ssm.domain.ScDisinfecting;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScDisinfectingService;
import com.sc.ssm.dao.ScDisinfectingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScDisinfectingServiceImpl extends ServiceImpl<ScDisinfectingMapper, ScDisinfecting>
implements ScDisinfectingService{

    @Autowired
    private ScDisinfectingMapper scDisinfectingMapper;

    /**
     * 查询消杀管理表
     *
     * @param page
     * @param row
     * @param type
     * @param check
     */
    @Override
    public PageInfo<ScDisinfecting> findDc(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScDisinfecting> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScDisinfecting> list = scDisinfectingMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




