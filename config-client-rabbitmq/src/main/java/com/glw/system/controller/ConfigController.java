package com.glw.system.controller;

import com.glw.system.entity.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : glw
 * @date : 2020/8/3
 * @time : 19:17
 * @Description : 配置中心的接口
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get")
    public ApiResponse<String> getConfigInfo() {
        return ApiResponse.success(serverPort + " >>> " + configInfo);
    }
}
