package com.glw.system.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author : glw
 * @date : 2020/6/23
 * @time : 15:02
 * @Description : 负载均衡接口
 */
public interface LoadBalancer {

    /**
     * 获取下一个服务实例脚标
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
