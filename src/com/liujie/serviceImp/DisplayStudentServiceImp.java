/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import java.util.List;

import com.liujie.dao.DisplayStudentDao;
import com.liujie.daoImp.DisplayStudentDaoImp;
import com.liujie.entity.Student;
import com.liujie.service.DisplayStudentService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DisplayStudentServiceImp implements DisplayStudentService{

	@Override
	public List<Student> students() {
		// TODO Auto-generated method stub
		DisplayStudentDao displayStudentDao=new DisplayStudentDaoImp();
		return displayStudentDao.students();
	}

}
