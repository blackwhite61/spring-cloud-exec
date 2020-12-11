package com.springcloud.microservice2.consumer;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired

    private EurekaClient discoveryClient2;

    public void test() {
        List<ServiceInstance> micro1 = discoveryClient.getInstances("micro1");
        micro1.stream().forEach((serviceInstance) -> {
            System.out.println(serviceInstance.getInstanceId());
        });
    }

}
