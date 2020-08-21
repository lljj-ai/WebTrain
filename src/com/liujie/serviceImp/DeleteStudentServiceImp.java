/*
 *华迪实训第八组
 */
package com.liujie.serviceImp;

import com.liujie.dao.DeleteStudentDao;
import com.liujie.daoImp.DeleteStudentDaoImp;
import com.liujie.entity.Student;
import com.liujie.service.DeleteStudentService;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DeleteStudentServiceImp implements DeleteStudentService {

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		DeleteStudentDao deleteStudentDao=new DeleteStudentDaoImp();
		deleteStudentDao.deleteStudent(student);
	}

}
