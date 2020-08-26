/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ILoginService
 * Author:   Dell-Elite
 * Date:     2020/8/25 8:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.service;

import com.hxyp.entity.Login;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
public interface ILoginService {
    boolean checkLogin(Login login);

    Integer identDiscrimination(String lName,String lPassword);

    boolean insertNewUser(Login login);

    boolean updateUser(Login login);

    boolean deleteUser(Integer lId);
}