package com.sc.ssm.server;

import com.sc.ssm.dao.ClassificationMapper;
import com.sc.ssm.pojo.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/22 21:35
 **/
@Service
public class ClassificationService {

    @Autowired
    ClassificationMapper classificationMapper;

    public List<Classification> getAll() {
        List<Classification> list = classificationMapper.getAll();
        return list;
    }

    public Classification selectById(Integer rubbishFyid) {
        Classification classification = classificationMapper.selectByPrimaryKey(rubbishFyid);
        return classification;
    }
}
