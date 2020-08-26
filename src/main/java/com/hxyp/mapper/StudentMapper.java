/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: StudentMapper
 * Author:   Dell-Elite
 * Date:     2020/8/25 15:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.mapper;

import com.hxyp.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;
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
public interface StudentMapper {
    //    增加学生
    int insertStudent(Student student);

    //    删除指定学生
    int deleteStudent(Integer sId);

    //    修改学生信息
    int updateStudent(Student student);

    //    查询所有学生信息
    List<Student> selectAllStudents(@Param("sName") String sName);
}
