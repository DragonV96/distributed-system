package com.glw.system.service.impl;

import com.glw.system.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author : glw
 * @date : 2020/8/4
 * @time : 12:02
 * @Description : 消息实现类
 */
@Slf4j
@EnableBinding(Source.class)    // 定义消息的推送管道
public class MessageProviderImpl implements MessageProvider {

    @Resource
    private MessageChannel output;  // 消息发送管道

    @Override
    public String send() {
        String message = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(message).build());
        log.info(" >>>> send message = {}", message);
        return message;
    }
}
