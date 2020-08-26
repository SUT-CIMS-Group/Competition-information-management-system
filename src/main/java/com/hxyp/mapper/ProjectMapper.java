/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProjectMapper
 * Author:   Dell-Elite
 * Date:     2020/8/25 14:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.mapper;

import com.hxyp.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
@Repository
@Mapper
public interface ProjectMapper {
//    增加项目
    int insertProject(Project project);

//    删除指定项目
    int deleteProject(@Param("projectName") String projectName);

//    修改项目信息
    int updateProject(Project project);

//    查询所有项目信息
    List<Project> selectAllProjects(@Param("pName") String pName);
}
