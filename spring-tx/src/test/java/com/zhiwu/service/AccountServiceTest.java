package com.zhiwu.service;

import com.zhiwu.MyConfiguration;
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
 * @Data 2024/7/2 22:39
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MyConfiguration.class)
class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    @Test
    void exchange() {
        boolean exchange = accountService.exchange(1, 2, 500);
        Assertions.assertTrue(exchange);
    }
}