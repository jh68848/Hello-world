package com.ysd.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String sname;
	private String sex;
	private int age;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int sid, String sname, String sex, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
