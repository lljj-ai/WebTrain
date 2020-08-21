/*
 *华迪实训第八组
 */
package com.liujie.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.liujie.dao.IndexDao;
import com.liujie.entity.RoleInfo;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class IndexDaoImp implements IndexDao {
	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	public static final String USER="root";
	public static final String PASSWORD="liujie13";
	private PreparedStatement pstmt=null;
	private String sql=null;
	private Connection conn=null;
	private ResultSet rst=null;
	@Override
	public String searchRole(RoleInfo roleInfo) {
		// TODO Auto-generated method stub
		RoleInfo roleInfo2=new RoleInfo();
		try {
			sql="SELECT userRole from role_info where account=? and `password`=? and `status`=1;";
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, roleInfo.getAccount());
			pstmt.setString(2, roleInfo.getPassword());
			rst=pstmt.executeQuery();
			while(rst.next()) {
				roleInfo2.setUserRole(rst.getString("userRole"));
				return roleInfo2.getUserRole();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rst.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
