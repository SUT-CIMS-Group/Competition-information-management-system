package com.hxyp;

import com.hxyp.entity.Login;
import com.hxyp.mapper.LoginMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.hxyp.mapper")
class InformationManagementSystemApplicationTests {

    @Autowired
    LoginMapper loginMapper;

    @Test
    void contextLoads() {
        System.out.println(loginMapper.insertLogin(new Login(null,"小黄","123",2)));
    }

}
