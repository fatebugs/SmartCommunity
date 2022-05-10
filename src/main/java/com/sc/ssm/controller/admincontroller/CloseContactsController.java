package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.domain.ScCloseContacts;
import com.sc.ssm.junit.Result;
import com.sc.ssm.service.ScCloseContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Date: 2022/5/10
 * Time: 10:03
 *
 * @author genesis
 */
@Controller
@RequestMapping("cc")
public class CloseContactsController {
    @Autowired
    private ScCloseContactsService scCloseContactsService;


    @RequestMapping("/closecontacts")
    public String toCloseContacts(){
        return "admin_closecontacts";
    }

    /**
     * 查询密接
     *
     * @param page 当前页
     * @param row  查多少行
     * @param type 查询的条件
     * @return
     */
    @RequestMapping("/findCC")
    @ResponseBody
    public Result findCC(@RequestParam(value = "page", defaultValue = "1") int page,
                         @RequestParam(value = "row", defaultValue = "5") int row,
                         @RequestParam(value = "type", required = false, defaultValue = "") String type,
                         @RequestParam(value = "check", required = false, defaultValue = "") String check) {
        PageInfo<ScCloseContacts> cc = scCloseContactsService.findCC(page, row, type, check);
        return Result.ok().put(cc);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Result deleteforId(@PathVariable(value = "id") int id) {
        boolean flag = scCloseContactsService.removeById(id);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
    @RequestMapping("/update")
    @ResponseBody
    public Result update(ScCloseContacts scCloseContacts){
        boolean flag = scCloseContactsService.updateById(scCloseContacts);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
    @RequestMapping("/save")
    @ResponseBody
    public Result save(ScCloseContacts scCloseContacts){
        boolean flag = scCloseContactsService.save(scCloseContacts);
        if (flag) {
            return Result.error();
        }
        return Result.ok();
    }
}
