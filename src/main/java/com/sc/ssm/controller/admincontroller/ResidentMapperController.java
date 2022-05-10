package com.sc.ssm.controller.admincontroller;

import com.github.pagehelper.PageInfo;
import com.sc.ssm.dao.UserMapper;
import com.sc.ssm.junit.IdWorker;
import com.sc.ssm.pojo.Resident;
import com.sc.ssm.pojo.User;
import com.sc.ssm.server.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.List;

/**
 * @author XINSHA-FU
 * @create 2022/3/24 17:56
 */
@Controller
public class ResidentMapperController {
    @Autowired
    ResidentService residentService;
    @Autowired
    private UserMapper userMapper;


    /**
     * 用户数据集合展示
     *
     * @param page  分页页数
     * @param row   当前页显示记录数
     * @param model model
     * @return
     */
    @RequestMapping(value = "/resident", method = RequestMethod.GET)
    public String residentList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "row", defaultValue = "5") int row, Model model) {
        PageInfo<Resident> residentPageInfo = residentService.getAll(page, row);
        model.addAttribute("residentPageInto", residentPageInfo);
        return "resident";
    }

    /**
     * 删除数据
     *
     * @param id 根据id删除
     * @return 重定向到数据集合展示
     */
    @RequestMapping(value = "/resident/{id}", method = RequestMethod.DELETE)
    public String residentDeleteById(@PathVariable(value = "id") int id) {
        residentService.deleteById(id);
        return "redirect:/resident";
    }

    /**
     * 根据id查询，用于数据回显
     *
     * @param id    id
     * @param model model
     * @return 视图页面
     */
    @RequestMapping(value = "/resident/{id}", method = RequestMethod.GET)
    public String residentSelectById(@PathVariable(value = "id") int id, Model model) {
        Resident resident = residentService.selectById(id);
        model.addAttribute("resident", resident);
        return "resident_Update";
    }

    /**
     * 修改操作，需先由id查到数据，回显后再修改
     *
     * @param resident
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "/resident", method = RequestMethod.PUT)
    public String updateResident(Resident resident) throws ParseException {
        residentService.save(resident);
        return "redirect:/resident";
    }


    /**
     * 模糊查询
     *
     * @param page    页数
     * @param row     记录数
     * @param type    查询条件
     * @param keyword 查询值
     * @param model   model
     * @return 返回结果
     */
    @RequestMapping("/residentfind")
    public String residentFind(@RequestParam(value = "page", defaultValue = "1") int page,
                               @RequestParam(value = "row", defaultValue = "5") int row,
                               @RequestParam(value = "type", required = false) String type,
                               @RequestParam(value = "keyword", required = false) String keyword,
                               Model model) {
        PageInfo<Resident> pageInfo = residentService.residentFind(page, row, type, keyword);
        model.addAttribute("findList", pageInfo);
        model.addAttribute("type", type);
        model.addAttribute("keyword", keyword);
        return "resident_Query";
    }

    /**
     * 添加数据
     * 先查user表的id，只有user表中有的才能添加
     *
     * @param model 再转发到添加页面
     * @return 返回结果
     */
    @RequestMapping("/residentInsert")
    public String residentBeforeUser(Model model) {
        List<Integer> idList = residentService.getUser();
        model.addAttribute("idList", idList);
        return "resident_Insert";
    }


    @RequestMapping(value = "/resident", method = RequestMethod.POST)
    public String residentSave(Resident resident) {
        residentService.insert(resident);
        return "redirect:/resident";
    }


}
