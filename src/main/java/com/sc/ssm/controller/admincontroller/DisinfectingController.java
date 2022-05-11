package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScDisinfecting;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScDisinfectingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Date: 2022/5/11
 * Time: 16:35
 *
 * @author genesis
 */
@Controller
@RequestMapping("/dc")
public class DisinfectingController {
    @Autowired
    private ScDisinfectingService scDisinfectingService;

    @RequestMapping("/disinfecting")
    public String toCloseContacts() {
        return "admin_disinfecting";
    }

    /**
     * 查询消杀数据
     *
     * @param page 当前页
     * @param row  查多少行
     * @param type 查询的条件
     * @return
     */
    @RequestMapping("/find")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScDisinfecting> dc = scDisinfectingService.findDc(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scDisinfectingService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScDisinfecting scDisinfecting) {
        boolean flag = scDisinfectingService.updateById(scDisinfecting);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScDisinfecting scDisinfecting) {
        boolean flag = scDisinfectingService.save(scDisinfecting);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
