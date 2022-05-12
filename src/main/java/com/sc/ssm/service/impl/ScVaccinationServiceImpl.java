package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.ScVaccinationMapper;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScVaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScVaccinationServiceImpl extends ServiceImpl<ScVaccinationMapper, ScVaccination> implements ScVaccinationService {

    @Autowired
    private ScVaccinationMapper scVaccinationMapper;

    /**
     *
     *
     * @param page
     * @param row
     * @param type
     * @param check
     */
    @Override
    public PageInfo<ScVaccination> findSv(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScVaccination> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScVaccination> list = scVaccinationMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




