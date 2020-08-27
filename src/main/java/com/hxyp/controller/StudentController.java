/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: StudentController
 * Author:   Dell-Elite
 * Date:     2020/8/27 11:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.controller;

import com.hxyp.entity.Student;
import com.hxyp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @RequestMapping("/insertStudent")
    public String insertStudent(Student student){
        if (iStudentService.insertStudent(student)){
            return "insert student successfully";
        }
        return "fail insert student";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(Integer sNumber){
        if (iStudentService.deleteStudent(sNumber)){
            return "delete successfully";
        }
        return "fail delete";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        if (iStudentService.updateStudent(student)){
            return "update successfully";
        }
        return "false";
    }

    @RequestMapping("/selectStudent")
    public String selectStudent(String sName){
        return iStudentService.selectStudentByName(sName).toString();
    }
}
