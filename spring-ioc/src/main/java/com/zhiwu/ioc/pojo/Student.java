package com.zhiwu.ioc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 功能：学生类
 *
 * @author zhiwu
 * @Data 2024/6/30 10:19
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Student {

    private int id;

    private String name;

    private String address;

    private int age;
}
