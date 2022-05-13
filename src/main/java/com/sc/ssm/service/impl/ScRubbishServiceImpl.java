package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScRubbish;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScRubbishService;
import com.sc.ssm.dao.ScRubbishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class ScRubbishServiceImpl extends ServiceImpl<ScRubbishMapper, ScRubbish>
implements ScRubbishService{

    @Autowired
    private ScRubbishMapper scRubbishMapper;

    @Override
    public PageInfo<Map<String ,Object>> findScR(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScRubbish> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }
        List<Map<String ,Object>> list=scRubbishMapper.findAll();
//        List<ScRubbish> list = scRubbishMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




