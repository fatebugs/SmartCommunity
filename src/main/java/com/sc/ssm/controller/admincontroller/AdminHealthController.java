package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.pojo.Health;
import com.sc.ssm.server.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FuXinSha
 * @create 2022/5/7 15:20
 **/
@Controller
public class AdminHealthController {

    @Autowired
    HealthService healthService;

    @RequestMapping(value = "/AdminHealth-1",method = RequestMethod.GET)
    public String queryHealthTo1(@RequestParam(value = "page", defaultValue = "1") int page,
                                 @RequestParam(value = "row", defaultValue = "5") int row,
                                 Model model){
        PageInfo<Health> healthPageInfo = healthService.qeuryTemperature(page,row);
        model.addAttribute("healthPageInfo",healthPageInfo);
        return "admin_health";
    }





}
