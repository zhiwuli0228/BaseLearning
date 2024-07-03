package com.zhiwu.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * 功能：学生实体类
 *
 * @author zhiwu
 * @Data 2024/7/3 22:39
 */
@Data
@ToString
public class Student {

    private int id;

    private String name;

    private String sex;

    private String address;
}
