/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TeacherMapper
 * Author:   Dell-Elite
 * Date:     2020/8/25 17:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.mapper;

import com.hxyp.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface TeacherMapper {
    //    增加老师
    int insertTeacher(Teacher teacher);

    //    删除指定老师
    int deleteTeacher(String tNumber);

    //    修改老师信息
    int updateTeacher(Teacher teacher);

    //    查询所有老师信息
    List<Teacher> selectAllTeachers(String tName);
}
