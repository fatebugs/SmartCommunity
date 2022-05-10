package com.sc.ssm.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.VisitMapper;
import com.sc.ssm.pojo.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/13 17:42
 **/
@Controller
public class VisitService {

    @Autowired
    VisitMapper visitMapper;

    public void save(Visit visit){
        Visit v = visitMapper.selectByPrimaryKey(visit.getVisitId(), visit.getVisitIds());
        if (v==null || v.equals(" ")) {
            visitMapper.insertSelective(visit);
        }else{
            visitMapper.updateByPrimaryKeySelective(visit);
        }
    }

    public PageInfo<Visit> getAll(int id, int page, int row) {
        PageHelper.startPage(page,row);
        List<Visit> visitList= visitMapper.selectAllById(id);
        PageInfo<Visit> visitPageInfo = new PageInfo<>(visitList, 3);
        return visitPageInfo;
    }
}
