/*
 *华迪实训第八组
 */
package com.liujie.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.liujie.dao.UpdateStudentDao;
import com.liujie.entity.Student;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class UpdateStudentDaoImp implements UpdateStudentDao {
	public static final String DRIVER="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	public static final String USER="root";
	public static final String PASSWORD="liujie13";
	private PreparedStatement pstmt=null;
	private Connection conn=null;
	private String sql=null;
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			sql="update student set password=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student.getPassword());
			pstmt.setInt(2, student.getId());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
