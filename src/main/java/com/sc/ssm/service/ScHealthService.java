package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScHealth;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sc.ssm.domain.ScVaccination;

/**
 *
 */
public interface ScHealthService extends IService<ScHealth> {
    PageInfo<ScHealth> findSHS(int page, int row, String type, String check);

}
