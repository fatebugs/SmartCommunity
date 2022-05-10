package com.sc.ssm.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.OrderMapper;
import com.sc.ssm.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/27 21:39
 **/
@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    public PageInfo<Order> getAll(String name, String phone, int page, int row) {
        PageHelper.startPage(page,row);
        List<Order> orderList = orderMapper.selectBysame(name,phone);
        PageInfo<Order> orderPageInfo = new PageInfo<>(orderList,10);
        return orderPageInfo;
    }

    public void save(Order order){
        orderMapper.insertSelective(order);
    }

}
