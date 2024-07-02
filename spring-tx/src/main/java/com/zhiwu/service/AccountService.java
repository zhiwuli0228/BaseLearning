package com.zhiwu.service;

import com.zhiwu.dao.AccountDao;
import com.zhiwu.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/2 22:30
 */
@Service
public class AccountService {

    private AccountDao accountDao;

    @Transactional
    public boolean exchange(int id1, int id2, int account) {
        // 更新账户1数据
        Account account1 = accountDao.findById(id1);
        account1.setBalance(account1.getBalance() - account);
        accountDao.update(account1);

        // 更新账户2信息
        Account account2 = accountDao.findById(id1);
        account2.setBalance(account2.getBalance() + account);
        int update = accountDao.update(account2);
        return update >= 1;

    }

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
