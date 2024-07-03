package com.zhiwu.service;

import com.zhiwu.dao.StudentDao;
import com.zhiwu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/3 22:44
 */
@Service
public class StudentService {


    private StudentDao studentDao;

    public Student queryStudentById(int id) {
        return studentDao.findById(id);
    }

    public int deleteStudentById(int id) {
        return studentDao.deleteById(id);
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
