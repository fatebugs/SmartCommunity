package com.sc.ssm.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScCloseContacts;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface ScCloseContactsService extends IService<ScCloseContacts> {
    /**
     * 查询密切接触者表
     * @param page
     * @param row
     * @param type
     */
    PageInfo<ScCloseContacts> findCC(int page, int row, String type,String check);

}
