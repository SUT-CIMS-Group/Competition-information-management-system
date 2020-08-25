package com.hxyp;

import com.hxyp.entity.Login;
import com.hxyp.entity.Project;
import com.hxyp.entity.Student;
import com.hxyp.mapper.LoginMapper;
import com.hxyp.mapper.ProjectMapper;
import com.hxyp.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.hxyp.mapper")
class InformationManagementSystemApplicationTests {

    @Autowired
    LoginMapper loginMapper;
    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    StudentMapper studentMapper;

    @Test
    public void testInsertStudent(){
        Student stu = new Student(null,"李四",184312102,"计算机","自动化学院","19824889432",0);
        studentMapper.insertStudent(stu);
        System.out.println(stu.getSId());
    }

    @Test
    public void testDeleteStudent(){
        System.out.println(studentMapper.deleteStudent(2));
    }
}
