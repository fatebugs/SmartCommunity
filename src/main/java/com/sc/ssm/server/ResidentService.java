package com.sc.ssm.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.ResidentMapper;
import com.sc.ssm.dao.UserMapper;
import com.sc.ssm.pojo.Resident;
import com.sc.ssm.pojo.ResidentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author XINSHA-FU
 * @create 2022/3/24 18:01
 */
@Service
public class ResidentService {
    @Autowired
    ResidentMapper residentMapper;

    @Autowired
    UserMapper userMapper;

    public PageInfo<Resident> getAll(int page, int row){
        PageHelper.startPage(page,row);
        List<Resident> residentList = residentMapper.selectAll();
        PageInfo<Resident> residentPageInfo = new PageInfo<>(residentList, 3);
        return residentPageInfo;
    }

    public int deleteById(int id) {
        int i = residentMapper.deleteByPrimaryKey(id);
        return i;
    }

    public Resident selectById(int id) {
        return residentMapper.selectByPrimaryKey(id);
    }

    public void save(Resident resident) {
        residentMapper.updateByPrimaryKeySelective(resident);
    }

    /**
     * 模糊查询
     * @param page 页数
     * @param row  记录数
     * @param type 查询条件
     * @param keyword 查询值
     * @return 返回结果
     */
    public PageInfo<Resident> residentFind(int page, int row, String type, String keyword) {
        PageHelper.startPage(page,row);
        ResidentExample residentExample = new ResidentExample();
        if(StringUtils.hasLength(type) && StringUtils.hasLength(keyword)){
            if (type.equals("residentsName")) {
                residentExample.createCriteria().andResidentsNameLike("%"+keyword+"%");
            }else if(type.equals("residentsPhone")){
                residentExample.createCriteria().andResidentsPhoneLike("%"+keyword+"%");
            } else if (type.equals("residentsAdress")) {
                residentExample.createCriteria().andResidentsAdressLike("%"+keyword+"%");
            } else if(type.equals("residentsSecurity")){
                if(keyword.equals("健康")){
                    residentExample.createCriteria().andResidentsSecurityLike("%"+0+"%");
                }else{
                    residentExample.createCriteria().andResidentsSecurityLike("%"+1+"%");
                }
            }
        }
        List<Resident> residents = residentMapper.selectByExample(residentExample);
        return new PageInfo<>(residents,5);
    }

    public List<Integer> getUser() {
        // 获取userid
        List<Integer> uIdList = userMapper.queryAllUserId();
        // 获取residentid
        List<Integer> resIdList = residentMapper.queryAllResidentId();
        // 去掉二者中重复的元素
        if (uIdList != null && resIdList != null) {
            if (uIdList.size() != 0 && resIdList.size() != 0) {
                Collection A = new ArrayList<>(uIdList);
                Collection B = new ArrayList<>(resIdList);
                // 保留二者的公共元素，此时B中存的就是公共元素
                B.retainAll(A);
                if (B.size() != 0) {
                    // 去掉重复元素
                    A.removeAll(B);
                }
                return (List<Integer>)A;
            }
        }
        return uIdList;
    }

    public void insert(Resident resident) {
        residentMapper.insertSelective(resident);
    }
}
