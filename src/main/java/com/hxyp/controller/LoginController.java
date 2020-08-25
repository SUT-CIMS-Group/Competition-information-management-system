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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
@RestController
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    //登录验证
    @RequestMapping("/login")
    public String login(String username, String password){
        Login login = new Login();
        login.setLName(username);
        login.setLPassword(password);
        Integer result = iLoginService.identDiscrimination(login);
        //1为教师，2为学生
        if (result != -1){
            return result == 1 ? "front/teacher" : "front/student";
        }
        return "error";
    }

    //增加新用户
    @RequestMapping("/addUser")
    public String addUser(Login login){
        if(iLoginService.insertNewUser(login)){
            return "增加成功";
        }
        return "增加失败";
    }

    //更改用户
    @RequestMapping("/updateUser")
    public String updateUser(Login login){
        if (iLoginService.updateUser(login)){
            return "修改成功";
        }
        return "修改失败";
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(Login login){
        if (iLoginService.deleteUser(login)){
            return "删除成功";
        }
        return "删除失败";
    }
}
