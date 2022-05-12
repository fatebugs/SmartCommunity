package com.sc.ssm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScCloseContacts;
import com.sc.ssm.domain.ScDisinfecting;

/**
 *
 */
public interface ScDisinfectingService extends IService<ScDisinfecting> {
    /**
     *
     *
     * @param page
     * @param row
     * @param type
     */
    PageInfo<ScDisinfecting> findDc(int page, int row, String type, String check);
}
