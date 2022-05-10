package com.sc.ssm.controller.usercontroller;

import com.sc.ssm.pojo.Classification;
import com.sc.ssm.pojo.Rubbish;
import com.sc.ssm.server.ClassificationService;
import com.sc.ssm.server.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author FuXinSha
 * @create 2022/4/27 16:05
 **/
@Controller
public class UserRubbishController {

    @Autowired
    RubbishService rubbishService;

    @Autowired
    ClassificationService classificationService;

    @RequestMapping("/queryRubbish")
    public String queryRubbish(@RequestParam("keyword") String Keyword, Model model){
        List<Rubbish> rubbishList=rubbishService.query(Keyword);

        if (rubbishList.size()==1) {
            Rubbish rubbish = rubbishList.get(0);
            model.addAttribute("rubbish",rubbish);

            Classification classification = classificationService.selectById(rubbish.getRubbishFyid());
            model.addAttribute("classification",classification);
        }
        model.addAttribute("Keyword",Keyword);
        return "forward:/userClassification";
    }
}
