package com.yanerbo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 这里需要添加@EnableConfigServer  去启动Spring cloud config server
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
