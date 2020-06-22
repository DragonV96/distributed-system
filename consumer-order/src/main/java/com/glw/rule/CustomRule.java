package com.glw.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : glw
 * @date : 2020/6/22
 * @time : 17:07
 * @Description : 自定义负载均衡过滤规则
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
