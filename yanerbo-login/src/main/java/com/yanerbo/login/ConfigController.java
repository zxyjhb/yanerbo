package com.yanerbo.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
	
	
	@Value("${yanerbo-db-mysql-user}")
	private String user;
	
	@RequestMapping("/user")
    public String getUser() {
    	
        return user;
    }
   
}
