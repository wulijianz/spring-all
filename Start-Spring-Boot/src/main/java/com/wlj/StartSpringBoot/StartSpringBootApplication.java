package com.wlj.StartSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.wlj.StartSpringBoot.bean.BlogProperties;
import com.wlj.StartSpringBoot.bean.TestConfigBean;


@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class,TestConfigBean.class})
public class StartSpringBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootApplication.class, args);
	}

}
