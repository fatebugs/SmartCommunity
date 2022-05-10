package com.sc.ssm.dao;

import com.sc.ssm.pojo.User;
import com.sc.ssm.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectOneByNameAndPass(@Param("userName") String userName,@Param("userPass") String userPass);

    List<User> selectOneByUserName(@Param("userName") String userName);

    List<Integer> queryAllUserId();
}
