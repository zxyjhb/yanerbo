package com.yanerbo.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 这里需要添加@EnableEurekaServer  去启动Spring cloud eureka注册服务
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
