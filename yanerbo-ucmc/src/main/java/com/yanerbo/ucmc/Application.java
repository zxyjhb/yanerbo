package com.yanerbo.ucmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 这里需要添加@EnableConfigServer  去启动Spring cloud config server
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableConfigServer
@RestController
@EnableEurekaClient
public class Application {
	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/info")
    public String info() {
        return "Hello ucms!";
    }
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
