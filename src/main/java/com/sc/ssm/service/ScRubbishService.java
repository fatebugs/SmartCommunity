package com.sc.ssm.service;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScRubbish;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 *
 */
public interface ScRubbishService extends IService<ScRubbish> {

    PageInfo<Map<String ,Object>> findScR(int page, int row, String type, String check);
}
