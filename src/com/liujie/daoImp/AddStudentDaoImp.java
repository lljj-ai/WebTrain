/*
 *华迪实训第八组
 */
package com.liujie.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.liujie.dao.AddStudentDao;
import com.liujie.entity.Student;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class AddStudentDaoImp implements AddStudentDao {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	public static final String USER = "root";
	public static final String PASSWORD = "liujie13";
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private String sql=null;
	@Override
	public void addStudent(Student student) {
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
		sql="INSERT INTO student(name,account,password) VALUES(?,?,?);";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,student.getName() );
			pstmt.setString(2,student.getAccount() );
			pstmt.setString(3, student.getPassword());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
