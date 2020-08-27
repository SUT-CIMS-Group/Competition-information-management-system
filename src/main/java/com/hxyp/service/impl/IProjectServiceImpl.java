/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IProjectServiceImpl
 * Author:   Dell-Elite
 * Date:     2020/8/25 15:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service.impl;

import com.hxyp.entity.Project;
import com.hxyp.mapper.ProjectMapper;
import com.hxyp.service.IProjectService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
@Service
public class IProjectServiceImpl implements IProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public boolean insertProject(@NotNull Project project) {
        String pName = project.getPName();
        if (pName != null) {
            return projectMapper.insertProject(project) == 1;
        }
        return false;
    }

    @Override
    public boolean deleteProject(@NotNull String projectName) {
        return projectMapper.deleteProject(projectName) == 1;
    }

    @Override
    public boolean updateProject(@NotNull Project project) {
        Integer pId = project.getPId();
        String pName = project.getPName();
        if (pId!=null && pName != null) {
            return projectMapper.updateProject(project) == 1;
        }
        return false;
    }

    @Override
    public List<Project> findProject(@NotNull String projectName) {
        return projectMapper.selectAllProjects(projectName);
    }
}
