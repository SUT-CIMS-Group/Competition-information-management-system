/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ILoginServiceImpl
 * Author:   Dell-Elite
 * Date:     2020/8/25 8:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service.impl;

import com.hxyp.entity.Login;
import com.hxyp.mapper.LoginMapper;
import com.hxyp.service.ILoginService;
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
public class ILoginServiceImpl implements ILoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean checkLogin(@NotNull Login login) {
        return loginMapper.findLogin(login.getLName(), login.getLPassword()) != null;
    }

    @Override
    public Login getLogin(@NotNull String lName, @NotNull String lPassword) {
        return loginMapper.findLogin(lName, lPassword);
    }

/*    @Override
    public Integer identDiscrimination(@NotNull String lName, @NotNull String lPassword) {
        Login discrimination = loginMapper.findLogin(lName, lPassword);
        return discrimination != null ? discrimination.getLPower() : -1;
    }*/

    @Override
    public boolean insertNewUser(@NotNull Login login) {
        String lName = login.getLName();
        String lPassword = login.getLPassword();
        Integer lPower = login.getLPower();
        if (lName != null && lPassword != null && lPower != null && !checkLogin(login)) {
            if (!(lPower < 1 || lPower > 3)) { //身份代表编号仅仅有1、2、3
                return loginMapper.insertLogin(login) == 1 ? true : false;
            }
        }
        return false;
    }

    @Override
    public boolean updateUser(@NotNull Login login) {
        Integer lId = login.getLId();
        Integer lPower = login.getLPower();
        if (lId == null || lPower == null) {//用户的id和身份不能为空
            return false;
        } else if (loginMapper.updateLogin(login) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(@NotNull Integer lId) {
        if (loginMapper.deleteLogin(lId) == 1) return true;
        return false;
    }

    @Override
    public List<Login> findAll() {
        return loginMapper.findAll();
    }
}
