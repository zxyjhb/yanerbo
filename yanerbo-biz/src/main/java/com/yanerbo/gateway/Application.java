package com.yanerbo.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 这里需要添加@EnableZuulProxy  去启动Spring cloud zuul网关服务
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
