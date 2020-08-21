/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import com.liujie.dao.UpdateStudentDao;
import com.liujie.daoImp.UpdateStudentDaoImp;
import com.liujie.entity.Student;
import com.liujie.service.UpdateStudentService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class UpdateStudentServiceImp implements UpdateStudentService {

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		UpdateStudentDao updateStudentDao=new UpdateStudentDaoImp();
		updateStudentDao.updateStudent(student);
	}

}
