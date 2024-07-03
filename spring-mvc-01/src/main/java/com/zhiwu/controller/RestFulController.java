package com.zhiwu.controller;

import com.zhiwu.pojo.Student;
import com.zhiwu.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/3 22:20
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class RestFulController {

    private StudentService studentService;

    @DeleteMapping(value = "/{id}")
    public String deleteById(@PathVariable int id) {
        studentService.deleteStudentById(id);
        return "zhiwu";
    }

    @GetMapping(value = "/{id}")
    public Student getById(@PathVariable("id") int id) {
        Student student = studentService.queryStudentById(id);
        log.info("student is {}", student);
        return student;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
