package com.glw.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : glw
 * @date : 2020/8/4
 * @time : 12:10
 * @Description : 消息发送接口层
 */
@Slf4j
@EnableBinding(Sink.class)
@RestController
public class SendMessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        log.info(" consumer receive = {}， server port = {}", message.getPayload(), serverPort);
    }
}
