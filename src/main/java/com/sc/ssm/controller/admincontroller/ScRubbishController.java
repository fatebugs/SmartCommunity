package com.sc.ssm.controller.admincontroller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScRubbish;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScClassificationService;
import com.sc.ssm.service.ScRubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Date: 2022/5/13
 * Time: 15:10
 *
 * @author genesis
 */
@Controller
@RequestMapping("/scr")
public class ScRubbishController {

    @Autowired
    private ScClassificationService scClassificationService;

    @Autowired
    private ScRubbishService scRubbishService;

    @RequestMapping("/rubbish")
    public String toRubbish() {
        return "admin_rubbish";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, @RequestParam(value = "type", required = false, defaultValue = "") String type, @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<Map<String, Object>> dc = scRubbishService.findScR(page, row, type, check);
        return Result.ok().put(dc);
    }

    /**
     * 查询表里所有的id并分组
     */
    @RequestMapping("/findAllId")
    @ResponseBody
    public Result findAllId() {
        return Result.ok().put(scClassificationService.findAllId());
    }

    /**
     * 查询是否有重复
     */
    @RequestMapping("/findByName/{name}")
    @ResponseBody
    public Result findByName(@PathVariable(value = "name") String name) {
        QueryWrapper<ScRubbish> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("rubbish_name", name);
        ScRubbish one = scRubbishService.getOne(queryWrapper);
        if (one == null) {
            return Result.ok();

        }
        return Result.error("此条已存在");
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scRubbishService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody ScRubbish scRubbish) {
        boolean flag = scRubbishService.updateById(scRubbish);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(@RequestBody ScRubbish scRubbish) {
        QueryWrapper<ScRubbish> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("rubbish_name", scRubbish.getRubbishName());
        ScRubbish one = scRubbishService.getOne(queryWrapper);
        if (one != null) {
            return Result.error("此条已存在");
        }

        boolean flag = scRubbishService.save(scRubbish);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
