package com.glw.system.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : glw
 * @date : 2020/7/29
 * @time : 15:57
 * @Description : 配置自定义 feign 的日志级别
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
