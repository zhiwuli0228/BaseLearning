package com.zhiwu.schedule;

import com.zhiwu.SpringConfig;
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
 * @Data 2024/7/2 23:01
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
class TimeTask01Test {

    @Autowired
    private TimeTask01 timeTask01;
    @Test
    void doSomething() {
        while (true) {

        }
    }
}