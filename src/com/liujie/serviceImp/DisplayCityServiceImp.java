/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import java.util.List;

import com.liujie.dao.DisplayCityDao;
import com.liujie.daoImp.DisplayCityDaoImp;
import com.liujie.entity.City;
import com.liujie.service.DisplayCityService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DisplayCityServiceImp implements DisplayCityService {

	@Override
	public List<City> displayCities() {
		// TODO Auto-generated method stub
		DisplayCityDao displayCityDao = new DisplayCityDaoImp();
		return displayCityDao.displaCities();
	}

}
