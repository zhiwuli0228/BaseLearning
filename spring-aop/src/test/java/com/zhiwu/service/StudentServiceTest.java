package com.zhiwu.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.zhiwu.service.StudentService;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/1 22:42
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void add() {
        studentService.add();
    }

    @Test
    void remove() {
        studentService.remove();
    }

    @Test
    void update() {
        studentService.update();
    }
}