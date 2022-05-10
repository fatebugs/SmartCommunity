package com.sc.ssm.controller.usercontroller;

import com.sc.ssm.pojo.Resident;
import com.sc.ssm.pojo.Vaccination;
import com.sc.ssm.server.ResidentService;
import com.sc.ssm.server.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FuXinSha
 * @create 2022/4/22 17:17
 **/
@Controller
public class UserVaccinationController {

    @Autowired
    ResidentService residentService;

    @Autowired
    VaccinationService vaccinationService;

    @RequestMapping("/userVaccination")
    public String userVaccination(@RequestParam("id") int id, Model model){
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident",resident);
        return "user_vaccination";
    }

    @PostMapping("/vaccinationSave")
    public String vaccinationSave(Vaccination vaccination,Model model){
        vaccinationService.save(vaccination);
        return "redirect:/user";
    }
}
