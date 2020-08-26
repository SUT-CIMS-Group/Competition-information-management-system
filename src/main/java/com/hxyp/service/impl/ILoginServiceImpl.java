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
        return loginMapper.findLogin(login.getLName(),login.getLPassword()) != null;
    }

    @Override
    public Integer identDiscrimination(Login login) {
        Login discrimination = loginMapper.findLogin(login.getLName(),login.getLPassword());
        return discrimination != null ? discrimination.getLPower() : -1;
    }

    @Override
    public boolean insertNewUser(@NotNull Login login) {
        if (checkLogin(login)) {
            return false;
        }
        return loginMapper.insertLogin(login) == 1 ? true : false;
    }

    @Override
    public boolean updateUser(Login login) {
        if (loginMapper.updateLogin(login) == 1) return true;
        return false;
    }

    @Override
    public boolean deleteUser(Integer lId) {
        if (loginMapper.deleteLogin(lId) == 1) return true;
        return false;
    }
}
