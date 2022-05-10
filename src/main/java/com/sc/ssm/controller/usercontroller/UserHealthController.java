package com.sc.ssm.controller.usercontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.pojo.Health;
import com.sc.ssm.pojo.Resident;
import com.sc.ssm.server.HealthService;
import com.sc.ssm.server.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FuXinSha
 * @create 2022/4/16 21:53
 **/
@Controller
public class UserHealthController {

    @Autowired
    ResidentService residentService;

    @Autowired
    HealthService healthService;

    @RequestMapping("/userHealth")
    public String userHealth(@RequestParam("id") int  id,
                             @RequestParam(value = "page",defaultValue = "1") int page,
                             @RequestParam(value = "row",defaultValue = "10") int row,
                             Model model){
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident",resident);

        PageInfo<Health> healthPageInfo = healthService.getAll(id,page,row);
        model.addAttribute("healthPageInfo",healthPageInfo);
        return "user_health";
    }


    @PostMapping("/healthSave")
    public String healthSave(Health health,Model model){
        healthService.save(health);
        model.addAttribute("health",health);
        return "forward:/user";
    }



}
