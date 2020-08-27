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

    /*
    * 测试LoginMapper接口DAO方法
    * */
    @Test
    public void testInsertLogin(){
        Login lo1 = new Login(null, "test", "123456", 2);
        Login lo2 = new Login(null, "admin", "admin", 1);
        Login lo3 = new Login(null, "Tom", "123456", 2);
        loginMapper.insertLogin(lo1);
        loginMapper.insertLogin(lo2);
        loginMapper.insertLogin(lo3);
    }

    @Test
    public void testDeleteLogin(){
        Login tom = new Login(null, "Marry", "123", 1);
        loginMapper.insertLogin(tom);
        Integer id = tom.getLId();
        System.out.println(loginMapper.deleteLogin(id));
    }

    @Test
    public void testUpdateLogin(){
        Login mack = new Login(6, "Mack", "1234", 2);
        System.out.println(loginMapper.updateLogin(mack));
    }

    @Test
    public void testFindLogin(){
        System.out.println(loginMapper.findLogin("admin","123"));
    }

    /*
    * 测试StudentMapper接口DAO方法
    * */
    @Test
    public void testInsertStudent(){
        Student stu = new Student(null,"李四","184312102","计算机","自动化学院","19824889432",0);
        studentMapper.insertStudent(stu);
        System.out.println(stu.getSId());
    }

    @Test
    public void testDeleteStudent(){
        System.out.println(studentMapper.deleteStudent(2));
    }

    @Test
    public void testUpdateStudent(){
        Student stu1 = new Student(3, "王五", "184312103", "计算机", "自动化学院", "13413265542", 0);
        System.out.println(studentMapper.updateStudent(stu1));
    }

    @Test
    public void testSelectAllStudents(){
        System.out.println(studentMapper.selectAllStudents(null));
        System.out.println("===========================");
        System.out.println(studentMapper.selectAllStudents(1));
    }

    /*
    * 测试ProjectMapper接口DAO
    * */
    @Test
    public void testInsertProject(){
        Project p1 = new Project(null, "房屋管理系统", 1, 0, 0, 0, 0);
        System.out.println(projectMapper.insertProject(p1));
    }

    @Test
    public void testDeleteProject(){
        String projectName = "sdf12";
        System.out.println(projectMapper.deleteProject(projectName));
    }
}
