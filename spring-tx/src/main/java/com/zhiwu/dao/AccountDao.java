package com.zhiwu.dao;

import com.zhiwu.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 功能：账户更新接口
 *
 * @author zhiwu
 * @Data 2024/7/2 22:20
 */
@Repository
public interface AccountDao {

    /**
     * 根据id查询账户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Select("select * from account where id = ${id}")
    Account findById(int id);

    /**
     * 修改用户
     *
     * @param account 账户信息
     * @return 是否更新成功
     */
    @Update("update account set balance = ${balance} where id = ${id}")
    int update(Account account);
}
