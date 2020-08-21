/*
 *华迪实训第八组
 */
package com.liujie.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.liujie.dao.DisplayStudentDao;
import com.liujie.entity.Student;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DisplayStudentDaoImp implements DisplayStudentDao {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	public static final String USER = "root";
	public static final String PASSWORD = "liujie13";
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private String sql=null;
	private ResultSet rst=null;
	@Override
	public List<Student> students() {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sql="select * from student";
			pstmt=conn.prepareStatement(sql);
			List<Student> students=new ArrayList<Student>();
			rst=pstmt.executeQuery();
			while(rst.next()) {
				Student student=new Student();
				student.setId(rst.getInt("id"));
				student.setName(rst.getString("name"));
				student.setAccount(rst.getString("account"));
				student.setPassword(rst.getString("password"));
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
