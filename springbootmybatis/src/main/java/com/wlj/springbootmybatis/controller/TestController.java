package com.wlj.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wlj.springbootmybatis.domain.Student;
import com.wlj.springbootmybatis.service.StudentService;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/querystudent", method = RequestMethod.GET)
	public Student queryStudentBySno(String sno) {
		return this.studentService.queryStudentBySno(sno);
	}
}
