package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScHealth;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Date: 2022/5/12
 * Time: 23:57
 *
 * @author genesis
 */
@Controller
@RequestMapping("/hc")
public class HealthController {
    @Autowired
    private ScHealthService scHealthService;

    @RequestMapping("/health")
    public String toHealth(){
        return "admin_health";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScHealth> dc = scHealthService.findSHS(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scHealthService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScHealth scHealth) {
        boolean flag = scHealthService.updateById(scHealth);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScHealth scHealth) {
        boolean flag = scHealthService.save(scHealth);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
