package com.wlj.springbootmybatis.domain;

import java.io.Serializable;

public class Student implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	private String sno;
	private String name;
	private String sex;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
