package com.zhiwu.dao;

import com.zhiwu.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/1 19:27
 */
@Repository
public interface StudentDao {

    @Select("SELECT * from student where id = ${id}")
    Student queryById(int id);

    @Select("SELECT * from student")
    List<Student> queryAll();

    @Insert("insert into student values (null, ${name}, ${sex}, ${address})")
    void add(Student student);
}
