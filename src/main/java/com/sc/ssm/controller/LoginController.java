package com.sc.ssm.controller;

import com.sc.ssm.pojo.User;
import com.sc.ssm.server.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @Author XINSHA-FU
 * @Create 2022/3/17 21:31
 */
@Controller
public class LoginController {

    @Autowired
    LoginServer loginServer;

    /**
     *
     * @return
     */
    @RequestMapping(value = {"/"})
    public String index() {
        return "login";
    }

    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    public ModelAndView longin(User user, HttpSession session) {
        User loginUser = loginServer.selectOne(user);
        ModelAndView mav = new ModelAndView();

        if (loginUser != null) {

            if (user.getUserIdentity() != null && !("".equals(user.getUserIdentity()))) {

                if(Objects.equals(user.getUserIdentity(), loginUser.getUserIdentity())) {
                    if ("user".equals(loginUser.getUserIdentity())) {
                        session.setAttribute("name",loginUser.getUserName());
                        //mav.addObject("userId",loginUser.getUserId());
                        session.setAttribute("userId",loginUser.getUserId());
                        mav.setViewName("user-index");

                    } else if ("admin".equals(loginUser.getUserIdentity())) {
                        session.setAttribute("name",loginUser.getUserName());
                        //mav.addObject("adminId",loginUser.getUserId());
                        session.setAttribute("adminId",loginUser.getUserId());
                        mav.setViewName("admin-index");

                    } else if ("visitor".equals(loginUser.getUserIdentity())){
                        session.setAttribute("name",loginUser.getUserName());
                        //mav.addObject("visitorId",loginUser.getUserId());
                        session.setAttribute("visitorId",loginUser.getUserId());
                        mav.setViewName("visitor-index");
                    }
                }else {
                    mav.addObject("message", "请选择正确的身份验证");
                }

            }else{
                mav.addObject("message", "请选择身份验证");
            }

        } else {
            mav.addObject("message","用户名或密码错误!");
        }
        return mav;
    }
}
