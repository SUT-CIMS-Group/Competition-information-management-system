/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IProjectService
 * Author:   Dell-Elite
 * Date:     2020/8/25 15:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service;

import com.hxyp.entity.Project;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
public interface IProjectService {
    boolean insertProject(Project project);

    boolean deleteProject(String projectName);

    boolean updateProject(Project project);

    List<Project> findProject(String projectName);
}
