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

import com.liujie.dao.DisplayCityDao;
import com.liujie.entity.City;
/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DisplayCityDaoImp implements DisplayCityDao {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	public static final String USER = "root";
	public static final String PASSWORD = "liujie13";
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private String sql = null;
	private ResultSet rst = null;
	@Override
	public List<City> displaCities() {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM city";
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt = conn.prepareStatement(sql);
			List<City> cities = new ArrayList<City>();
			rst = pstmt.executeQuery(sql);
			while (rst.next()) {
				City city = new City();
				city.setId(rst.getInt("ID"));
				city.setName(rst.getString("Name"));
				city.setCountryCode(rst.getString("CountryCode"));
				city.setDistrict(rst.getString("District"));
				city.setPopulation(rst.getString("Population"));
				cities.add(city);
			}
			return cities;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			try {
				rst.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
