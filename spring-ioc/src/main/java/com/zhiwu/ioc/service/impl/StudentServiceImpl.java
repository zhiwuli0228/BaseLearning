package com.zhiwu.ioc.service.impl;

import com.zhiwu.base.learn.baselearning.ioc.pojo.Student;
import com.zhiwu.base.learn.baselearning.ioc.service.StudentService;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/6/30 10:23
 */
public class StudentServiceImpl implements StudentService {

    private int age;

    public StudentServiceImpl(int age) {
        this.age = age;
    }

    @Override
    public Student queryStudentById(int id) {
        return new Student(1, "zhangsan", "shenzhen", age);
    }
}
