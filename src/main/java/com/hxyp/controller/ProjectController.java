/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProjectController
 * Author:   Dell-Elite
 * Date:     2020/8/26 23:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.controller;

import com.hxyp.entity.Project;
import com.hxyp.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.ec.point.ProjectivePoint;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/26
 * @since 1.0.0
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private IProjectService iProjectService;

    @RequestMapping("/insertProject")
    public String insertProject(Project project){
        if (iProjectService.insertProject(project)){
            return "insert project success";
        }
        return "fail insert";
    }

    @RequestMapping("/deleteProject")
    public String deleteProject(String projectName){
        if (iProjectService.deleteProject(projectName)){
            return "Delete " + projectName +" successfully";
        }
        return "fail delete";
    }

    @RequestMapping("updateProject")
    public String updateProject(Project project){
        if (iProjectService.updateProject(project)){
            return "success update";
        }
        return "fail update";
    }

    @RequestMapping("/findProject")
    public String findProject(String projectName){
        return iProjectService.findProject(projectName).toString();
    }
}
