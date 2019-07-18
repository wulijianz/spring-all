package com.wlj.StartSpringBoot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="mrbird.blog")
public class BlogProperties {
	
	//@Value("${mrbird.blog.name}")
    private String name;
    
   // @Value("${mrbird.blog.title}")
    private String title;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    
}
