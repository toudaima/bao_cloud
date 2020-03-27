package com.ligouhai.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ligouhai
 * @date 2020-03-27 14:44
 * @description zookeeper 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }

}
