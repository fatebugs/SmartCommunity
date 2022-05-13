package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScClassification;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Date: 2022/5/13
 * Time: 14:07
 *
 * @author genesis
 */

@Controller
@RequestMapping("/scc")
public class ScClassificationController {
    @Autowired
    private ScClassificationService scClassificationService;

    @RequestMapping("/classification")
    public String toClassification(){
        return "admin_classification";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScClassification> dc = scClassificationService.findScS(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scClassificationService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScClassification scClassification) {
        boolean flag = scClassificationService.updateById(scClassification);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScClassification scClassification) {
        boolean flag = scClassificationService.save(scClassification);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
