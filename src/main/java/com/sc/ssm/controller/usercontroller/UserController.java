package com.sc.ssm.controller.usercontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.pojo.Resident;
import com.sc.ssm.pojo.Visit;
import com.sc.ssm.server.ResidentService;
import com.sc.ssm.server.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FuXinSha
 * @create 2022/4/8 17:17
 **/
@Controller
public class UserController {


    @Autowired
    ResidentService residentService;

    @Autowired
    VisitService visitService;

    @RequestMapping("/user")
    public String user(){
        return "user-index";
    }

    @RequestMapping("/userList")
    public String userOne(@RequestParam("id") int id,Model model){
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident",resident);
        return "user_personal";
    }

    @PutMapping("/usersave")
    public String userSave(Resident resident){
        residentService.save(resident);
        return "redirect:/user";
    }

    @RequestMapping("/userInAndOut")
    public String userInAndOut(@RequestParam("id") int id,
                               @RequestParam(value = "page", defaultValue = "1") int page,
                               @RequestParam(value = "row", defaultValue = "10") int row,
                               Model model){
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident",resident);

        PageInfo<Visit> visitPageInfo = visitService.getAll(id,page,row);
        model.addAttribute("visitPageInfo",visitPageInfo);
        return "user_inandout";
    }

    @PostMapping("/userinandoutSave")
    public String userinandoutSave(Visit visit,Model model){
        visitService.save(visit);
        model.addAttribute("visit", visit);
        return "forward:/user";
    }
}
