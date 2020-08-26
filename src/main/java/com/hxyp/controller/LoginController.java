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
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //登录验证
    @RequestMapping("/login")
    public String login(String username, String password){
        Integer result = iLoginService.identDiscrimination(username,password);
        //1为超级管理员，2为领导，3为教师
        if(result == 1){
            return "admin/superAdmin";
        } else if (result == 2){
            return "leader";
        } else if (result == 3){
            return "teacher";
        } else {
            return "redirect:/";//重新登录
        }
    }

    //增加新用户
    @RequestMapping("/addUser")
    public String addUser(Login login){
        if(iLoginService.insertNewUser(login)){
            return "success";
        }
        return "fail";
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
    public String deleteUser(Integer lId){
        if (iLoginService.deleteUser(lId)){
            return "删除成功";
        }
        return "删除失败";
    }
}
