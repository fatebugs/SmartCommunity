package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScDisinfecting;
import com.sc.ssm.domain.ScVaccination;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface ScVaccinationService extends IService<ScVaccination> {
    /**
     *
     *
     * @param page
     * @param row
     * @param type
     */
    PageInfo<ScVaccination> findSv(int page, int row, String type, String check);
}
