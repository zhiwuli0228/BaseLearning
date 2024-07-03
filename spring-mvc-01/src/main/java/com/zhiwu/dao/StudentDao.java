package com.zhiwu.dao;

import com.zhiwu.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/3 22:41
 */
@Repository
public interface StudentDao {

    @Select("select * from student where id = #{id}")
    Student findById(int id);

    @Delete("delete from student where id = #{id}")
    int deleteById(int id);
}
