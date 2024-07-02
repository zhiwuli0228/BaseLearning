package com.zhiwu.ioc.service.impl;


import com.zhiwu.ioc.service.StudentService;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/6/30 10:36
 */
public class StudentServiceFactory {


    /**
     * 通过非静态方法创建bean
     *
     * @return studentService
     */
    public static StudentService getStudentService() {
        return new StudentServiceImpl(22);
    }
}
