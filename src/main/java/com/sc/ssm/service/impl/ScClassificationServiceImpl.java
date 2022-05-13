package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScClassification;
import com.sc.ssm.domain.ScCloseContacts;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScClassificationService;
import com.sc.ssm.dao.ScClassificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class ScClassificationServiceImpl extends ServiceImpl<ScClassificationMapper, ScClassification>
implements ScClassificationService{
    @Autowired
    private ScClassificationMapper scClassificationMapper;

    @Override
    public PageInfo<ScClassification> findScS(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScClassification> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScClassification> list = scClassificationMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }

    @Override
    public List<Map<String ,Object>> findAllId() {
        return scClassificationMapper.selectAllId();
    }
}




