/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import com.liujie.dao.IndexDao;
import com.liujie.daoImp.IndexDaoImp;
import com.liujie.entity.RoleInfo;
import com.liujie.service.IndexService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class IndexServiceImp implements IndexService {

	@Override
	public String searchRole(RoleInfo roleInfo) {
		// TODO Auto-generated method stub
		IndexDao indexDao=new IndexDaoImp();
		return indexDao.searchRole(roleInfo);
	}

}
