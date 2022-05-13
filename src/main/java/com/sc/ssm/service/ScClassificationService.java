package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScClassification;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sc.ssm.domain.ScCloseContacts;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface ScClassificationService extends IService<ScClassification> {
    PageInfo<ScClassification> findScS(int page, int row, String type, String check);

    List<Map<String ,Object>> findAllId();
}
