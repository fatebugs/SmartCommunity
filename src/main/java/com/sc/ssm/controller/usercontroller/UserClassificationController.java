package com.sc.ssm.controller.usercontroller;

import com.sc.ssm.pojo.Classification;
import com.sc.ssm.server.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/22 21:34
 **/
@Controller
public class UserClassificationController {

    @Autowired
    ClassificationService classificationService;

    @RequestMapping("/userClassification")
    public String userClassification(Model model){
        List<Classification> list =  classificationService.getAll();
        model.addAttribute("list",list);
        return "user_classification";
    }
}
