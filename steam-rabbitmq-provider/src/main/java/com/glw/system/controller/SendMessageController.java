package com.glw.system.controller;

import com.glw.system.service.MessageProvider;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : glw
 * @date : 2020/8/4
 * @time : 12:10
 * @Description : 消息发送接口层
 */
@RestController
public class SendMessageController {

    @Resource
    private MessageProvider messageProvider;  // 消息发送管道

    @GetMapping("/send")
    public String sendMessage() {
        return messageProvider.send();
    }
}
