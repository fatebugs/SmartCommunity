package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScVisit;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Date: 2022/5/12
 * Time: 19:14
 *
 * @author genesis
 */
@Controller
@RequestMapping("/svc")
public class VisitController {
    @Autowired
    private ScVisitService scVisitService;

    @RequestMapping("/visitUser")
    public String toVisitUser() {
        return "admin_visitUser";
    }
    @RequestMapping("/visitExternal")
    public String toVisitExternal() {
        return "admin_visitExternal";
    }

    /**
     * 查询消杀数据
     *
     * @param page 当前页
     * @param row  查多少行
     * @param type 查询的条件
     * @return
     */
    @RequestMapping("/findUser")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScVisit> dc = scVisitService.findSvcUser(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/findExternal")
    @ResponseBody
    public Result findExternal(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScVisit> dc = scVisitService.findSvcExternal(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scVisitService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScVisit scVisit) {
        boolean flag = scVisitService.updateById(scVisit);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScVisit scVisit) {
        boolean flag = scVisitService.save(scVisit);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
