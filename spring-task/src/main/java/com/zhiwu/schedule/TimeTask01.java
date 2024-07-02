package com.zhiwu.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/2 22:58
 */
@Component
public class TimeTask01 {

    @Scheduled(cron = "5/10 * * * * *")
    public void doSomething() {
        System.out.println("开始执行");
    }
}
