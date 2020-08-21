/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import com.liujie.dao.AddStudentDao;
import com.liujie.daoImp.AddStudentDaoImp;
import com.liujie.entity.Student;
import com.liujie.service.AddStudentService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class AddStudentServiceImp implements AddStudentService {

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		AddStudentDao addCityDao=new AddStudentDaoImp();
		addCityDao.addStudent(student);
	}

}
