package com.zhiwu.ioc.service;

import com.zhiwu.base.learn.baselearning.ioc.pojo.Student;

/**
 * 功能：学生服务类
 *
 * @author zhiwu
 * @Data 2024/6/30 10:21
 */
public interface StudentService {

    Student queryStudentById(int id);
}
