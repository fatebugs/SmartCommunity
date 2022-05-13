package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sc.ssm.domain.ScVaccination;

/**
 *
 */
public interface ScOrderService extends IService<ScOrder> {
    PageInfo<ScOrder> findSov(int page, int row, String type, String check);
}
