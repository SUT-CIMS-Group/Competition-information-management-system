/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IStudentServiceImpl
 * Author:   Dell-Elite
 * Date:     2020/8/27 11:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service.impl;

import com.hxyp.entity.Student;
import com.hxyp.mapper.StudentMapper;
import com.hxyp.service.IStudentService;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/27
 * @since 1.0.0
 */
@Service
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean insertStudent(@NotNull Student student) {
        String sName = student.getSName();
        String sNumber = student.getSNumber();
        Integer sManager = student.getSManager();
        if (sName != null && sManager != null) {
            if (sManager == 0 || sManager == 1) {
                return studentMapper.insertStudent(student) == 1;
            }
        }
        return false;
    }

    @Override
    public boolean deleteStudent(@NotNull Integer sNumber) {
        return studentMapper.deleteStudent(sNumber) == 1;
    }

    @Override
    public boolean updateStudent(@NotNull Student student) {
        Integer sId = student.getSId();
        String sName = student.getSName();
        Integer sManager = student.getSManager();
        List<Student> students = selectStudent(sId);

        if (!students.isEmpty()) {
            Student oldStudent = students.get(0);
            String oldStudentSName = oldStudent.getSName();
            String oldStudentSNumber = oldStudent.getSNumber();
            Integer oldStudentSManager = oldStudent.getSManager();
            String oldStudentSCollege = oldStudent.getSCollege();
            String oldStudentSMajor = oldStudent.getSMajor();
            String oldStudentSPhone = oldStudent.getSPhone();
            if (student.getSName() == null) student.setSName(oldStudentSName);
            if (student.getSNumber() == null) student.setSNumber(oldStudentSNumber);
            if (student.getSManager() == null) student.setSManager(oldStudentSManager);
            if (student.getSCollege() == null) student.setSCollege(oldStudentSCollege);
            if (student.getSMajor() == null) student.setSMajor(oldStudentSMajor);
            if (student.getSPhone() == null) student.setSPhone(oldStudentSPhone);
        }

        if (sId != null && sName != null && sManager != null) {
            return studentMapper.updateStudent(student) == 1;
        }
        return false;
    }

    @Override
    public List<Student> selectStudent(@Nullable Integer sId) {
        return studentMapper.selectAllStudents(sId);
    }

    @Override
    public List<Student> selectStudentByName(@NotNull String sName) {
        return studentMapper.selectStudentByName(sName);
    }
}
