package com.zhiwu.service.impl;

import com.zhiwu.dao.StudentDao;
import com.zhiwu.pojo.Student;
import com.zhiwu.service.StudentService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/1 19:31
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findStudentById(int id) {

        return studentDao.queryById(id);
    }
}
