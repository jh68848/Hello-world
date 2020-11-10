package com.ysd.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ysd.dao.StudentDao;
import com.ysd.entity.Student;


public class test {

	public static void main(String[] args) {
		ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao sDao = (StudentDao) app.getBean("stduentDaoImpl");
		List<Student> list = sDao.getAll();
		for (Student student : list) {
			System.out.println(student);
		}

	}

}
