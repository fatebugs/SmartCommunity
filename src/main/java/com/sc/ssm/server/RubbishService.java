package com.sc.ssm.server;

import com.sc.ssm.dao.RubbishMapper;
import com.sc.ssm.pojo.Rubbish;
import com.sc.ssm.pojo.RubbishExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/27 16:06
 **/
@Service
public class RubbishService {

    @Autowired
    RubbishMapper rubbishMapper;

    public List<Rubbish> query(String keyword) {
        RubbishExample rubbishExample = new RubbishExample();
        if(StringUtils.hasLength(keyword)){
            rubbishExample.createCriteria().andRubbishNameLike("%"+keyword+"%");
        }
        List<Rubbish> rubbishes = rubbishMapper.selectByExample(rubbishExample);
        return rubbishes;
    }
}
