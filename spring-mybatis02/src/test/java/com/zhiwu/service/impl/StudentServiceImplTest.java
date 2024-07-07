package com.zhiwu.service.impl;

import com.zhiwu.dao.mapper.StudentMapper;
import com.zhiwu.pojo.Student;
import com.zhiwu.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.io.InputStream;

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

    @Test
    void findStudentById2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Student student = mapper.selectStudent(1);
            System.out.println(student);

        } catch (Throwable e) {
            sqlSession.close();
        }
    }
}