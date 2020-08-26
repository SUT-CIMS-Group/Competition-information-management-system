/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Teacher
 * Author:   Dell-Elite
 * Date:     2020/8/25 17:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dell-Elite
 * @create 2020/8/25
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer tId;
    private String tName;
    private String tPhone;
    private String tNumber;
}
