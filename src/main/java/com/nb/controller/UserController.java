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
        //session添加username以便登录展示
        session.setAttribute("username", service.getNameOnLogin(account, password));
        return userId;
    }

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

    /**
     * @Params [session]
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/20 15:31
     * @Description 销毁session，返回登录页
     */
    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/home";
    }

    /**
     * 修改密码
     */
    @GetMapping("/changePwdhtml")
    public String changePwdhtml() {
        return "changePwd";
    }

    @GetMapping("/changePwdCheck")
    @ResponseBody
    public Long changePwdCheck(String account, String password) {
        return service.getIdByUsernameAndPassword(account, password);
    }

    @RequestMapping("/changePwd")
    public boolean changePassByAccount(String account, String changePwd) {
        return service.changePassByAccount(account, changePwd);
    }

    /**
     * @Params [id, password]
     * @Return {@link boolean}
     * @Author 谭庆山
     * @Date 2021/7/21 8:47
     * @Description 根据id修改密码
     */
    @ResponseBody
    @GetMapping("/changepassbyid")
    public Boolean changePasswordById(Long id, String password) {
        return service.changePasswordById(id, password);
    }
}
