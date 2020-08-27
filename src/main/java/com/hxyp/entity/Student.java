/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Student
 * Author:   Dell-Elite
 * Date:     2020/8/25 15:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

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
public class Student {
    private Integer sId;
    private String sName;
    private String sNumber;
    private String sMajor;
    private String sCollege;
    private String sPhone;
    private Integer sManager;
}
