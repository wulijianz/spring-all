package com.wlj.StartSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlj.StartSpringBoot.bean.BlogProperties;

@RestController
public class IndexController {

	@Autowired
	private BlogProperties blogProperties;

	@RequestMapping("/")
	String index() {
		return blogProperties.getName() + "——" + blogProperties.getTitle();
	}
}
