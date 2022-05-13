package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScOrder;
import com.sc.ssm.domain.ScVaccination;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Date: 2022/5/13
 * Time: 23:46
 *
 * @author genesis
 */
@Controller
@RequestMapping("/soc")
public class ScOrderController {
    @Autowired
    private ScOrderService scOrderService;
    @RequestMapping("/order")
    public String toOrder(){
        return "admin_order";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScOrder> dc = scOrderService.findSov(page, row, type, check);
        return Result.ok().put(dc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scOrderService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScOrder scOrder) {
        boolean flag = scOrderService.updateById(scOrder);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScOrder scOrder) {
        boolean flag = scOrderService.save(scOrder);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
