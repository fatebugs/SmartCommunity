package com.sc.ssm.controller.usercontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.junit.IdWorker;
import com.sc.ssm.pojo.Order;
import com.sc.ssm.pojo.Resident;
import com.sc.ssm.server.OrderService;
import com.sc.ssm.server.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author FuXinSha
 * @create 2022/4/27 21:32
 **/
@Controller
public class UserOrderController {

    static int number=1;

    @Autowired
    ResidentService residentService;

    @Autowired
    OrderService orderService;

    @RequestMapping("/userOrder")
    public String userOrder(@RequestParam("id") int id,
                            @RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "row", defaultValue = "10") int row,
                            Model model){
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident",resident);

        PageInfo<Order> orderPageInfo = orderService.getAll(resident.getResidentsName(),resident.getResidentsPhone(),page,row);
        model.addAttribute("orderPageInfo",orderPageInfo);


        //格式说明 UUID20221111xxx CODE+当前年月日+编号（具体长度看需求）
        String front="UUID";//前缀
        //当前时间编码
        Date date = new Date();
        String bidDate = new SimpleDateFormat("yyyyMMdd").format(date);

        String bidNum = "00" + number++;
        String UUID = front+bidDate+bidNum;
        model.addAttribute("UUID",UUID);

        return "user_order";
    }


    @PostMapping("/userOrderSave")
    public String userOrderSave(Order order, Model model){
        orderService.save(order);
        return "forward:/user";
    }

}
