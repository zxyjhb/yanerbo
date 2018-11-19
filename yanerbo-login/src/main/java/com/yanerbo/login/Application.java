package com.yanerbo.login;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这里需要添加@EnableDiscoveryClient  去发现yanerbo-config服务
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
