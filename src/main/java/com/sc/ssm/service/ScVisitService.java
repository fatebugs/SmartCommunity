package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScVisit;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface ScVisitService extends IService<ScVisit> {

    PageInfo<ScVisit> findSvcUser(int page, int row, String type, String check);
    PageInfo<ScVisit> findSvcExternal(int page, int row, String type, String check);
}
