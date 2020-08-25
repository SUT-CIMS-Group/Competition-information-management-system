/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Project
 * Author:   Dell-Elite
 * Date:     2020/8/25 14:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.hxyp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Project {
    private Integer pId;
    private String pName;
    private Integer pSchResult;
    private Integer pEnProv;
    private Integer pProvResult;
    private Integer pEnNation;
    private Integer pNaResult;
}
