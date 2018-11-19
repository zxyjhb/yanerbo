package com.yanerbo.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
	
	
	@Value("${version}")
	private String version;
	
	@Value("${group}")
	private String group;
	
	@Value("${tag}")
	private String tag;
	
    @RequestMapping("/version")
    public String getVersion() {
    	
        return version;
    }
    
    @RequestMapping("/tag")
    public String getTag() {
        return tag;
    }
    
    @RequestMapping("/group")
    public String getGroup() {
        return group;
    }

}
