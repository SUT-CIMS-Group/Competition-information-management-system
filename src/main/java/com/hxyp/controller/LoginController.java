/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LoginController
 * Author:   Dell-Elite
 * Date:     2020/8/25 0:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.controller;

import com.hxyp.entity.Login;
import com.hxyp.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
@Controller
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    //登录验证
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Integer result = -1;

        if (login == null) {
            if (username == null || password == null) return "redirect:/";
            login = iLoginService.getLogin(username, password);
            if (login != null) {
                session.setAttribute("login", login);
                //测试用户
                System.out.println(login);
            }
        }
        result = login.getLPower();

        //1为超级管理员，2为领导，3为教师
        if (result == 1) {
            return "index";
        } else if (result == 2) {
            return "index";
        } else if (result == 3) {
            return "index";
        } else {
            return "redirect:/";//重新登录
        }
    }

    //增加新用户
    @RequestMapping("/addUser")
    public String addUser(Login login) {
        System.out.println(login.toString());
        if (iLoginService.insertNewUser(login)) {
            System.out.println("添加用户成功");
        }
        System.out.println("添加用户失败");
        return "index";
    }

    //更改用户
    @RequestMapping("/updateUser")
    public String updateUser(Login login) {
        if (iLoginService.updateUser(login)) {
            return "修改成功";
        }
        return "修改失败";
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer lId) {
        if (iLoginService.deleteUser(lId)) {
            return "删除成功";
        }
        return "删除失败";
    }

    @GetMapping("/findAll")
    public String finAll(Model model) {
        List<Login> logins = iLoginService.findAll();
        model.addAttribute("logins", logins);
        return "pages/admin/list";
    }
}
