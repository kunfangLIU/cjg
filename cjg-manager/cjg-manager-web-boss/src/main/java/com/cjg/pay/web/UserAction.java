package com.cjg.pay.web;

import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2017/10/23
 * Time: 11:10
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class UserAction {
    //自动注入业务层的userService类
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/login")
    public String doLogin(RpUserInfo rpUserInfo, HttpSession session){
        return  userService.checkUser(rpUserInfo,session);
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}