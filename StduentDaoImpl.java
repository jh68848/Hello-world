package com.ysd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.ysd.dao.StudentDao;
import com.ysd.entity.Student;

@Component
public class StduentDaoImpl implements StudentDao{
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	List<Student> list = new ArrayList<Student>();
	
	@Resource
	private DataSource dataSource; 

	@Override
	public List<Student> getAll() {
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement("select * from student");
			rs = ps.executeQuery();
			while(rs.next()) {
				
				int sid = rs.getInt("sid");
				String sname = rs.getString("sname");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				Student s = new Student(sid, sname, sex, age);
				list.add(s);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

}
