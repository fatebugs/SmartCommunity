package com.sc.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScCloseContacts;
import com.sc.ssm.junit.Convention;
import com.sc.ssm.service.ScCloseContactsService;
import com.sc.ssm.dao.ScCloseContactsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ScCloseContactsServiceImpl extends ServiceImpl<ScCloseContactsMapper, ScCloseContacts>
implements ScCloseContactsService{
    @Autowired
    private ScCloseContactsMapper scCloseContactsMapper;

    /**
     * 查询密切接触者表
     *
     * @param page
     * @param row
     * @param type
     */
    @Override
    public PageInfo<ScCloseContacts> findCC(int page, int row, String type, String check) {
        PageHelper.startPage(page, row);

        QueryWrapper<ScCloseContacts> queryWrapper = new QueryWrapper<>();
        if (!type.isEmpty()) {
            queryWrapper.like(new Convention().camalCase2snake_case(type), check);
        }

        List<ScCloseContacts> list = scCloseContactsMapper.selectList(queryWrapper);
        return new PageInfo<>(list);
    }
}




