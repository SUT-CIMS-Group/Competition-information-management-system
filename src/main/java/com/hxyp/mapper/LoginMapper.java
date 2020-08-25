/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LoginMapper
 * Author:   Dell-Elite
 * Date:     2020/8/24 23:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.mapper;

import com.hxyp.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/24
 * @since 1.0.0
 */
@Repository
@Mapper
public interface LoginMapper {
    //通过判断账号密码返回lPower类型，来确定身份
    Integer findLogin(Login login);
}
