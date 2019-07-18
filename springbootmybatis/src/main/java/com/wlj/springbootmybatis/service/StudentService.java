package com.wlj.springbootmybatis.service;

import com.wlj.springbootmybatis.domain.Student;

public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
