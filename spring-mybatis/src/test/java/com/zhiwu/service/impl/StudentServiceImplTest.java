package com.zhiwu.service.impl;

import com.zhiwu.pojo.Student;
import com.zhiwu.service.StudentService;
import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/1 19:50
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Test
    void findStudentById() {
        Student studentById = studentService.findStudentById(1);
        Assertions.assertNotNull(studentById);
    }
}