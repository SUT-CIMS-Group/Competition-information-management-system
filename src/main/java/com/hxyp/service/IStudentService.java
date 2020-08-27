/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IStudentService
 * Author:   Dell-Elite
 * Date:     2020/8/27 11:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service;

import com.hxyp.entity.Student;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/27
 * @since 1.0.0
 */
public interface IStudentService {
    boolean insertStudent(Student student);

    boolean deleteStudent(Integer sNumber);

    boolean updateStudent(Student student);

    List<Student> selectStudent(Integer sId);

    List<Student> selectStudentByName(String sName);
}
