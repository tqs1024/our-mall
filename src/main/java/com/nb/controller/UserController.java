package com.nb.controller;

import com.nb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 摸鱼小队
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    /**
     * 登录
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/check")
    @ResponseBody
    public Long login(String account, String password, HttpSession session) {
        Long userId = service.getIdByUsernameAndPassword(account, password);
        session.setAttribute("userId", userId);
        return userId;
    }
    /*修改密码*/

    /**
     * 注册用户
     */
    @GetMapping("/registerhtml")
    public String registerhtml() {
        return "register";
    }

    /**
     * @Params [NewAccount]
     * @Return {@link boolean}
     * @Author
     * @Date 2021/7/20 13:33
     * @Description 查询账户是否存在
     */
    @GetMapping("/registerCheck")
    @ResponseBody
    public boolean registerCheck(String NewAccount) {
        return service.registerCheck(NewAccount);
    }

    @GetMapping("/register")
    @ResponseBody
    public boolean register(String NewAccount, String NewAccountPwd) {
        return service.addByNameAndPass(NewAccount, NewAccountPwd);
    }

    /*查找用户信息（订单需要）*/

}
