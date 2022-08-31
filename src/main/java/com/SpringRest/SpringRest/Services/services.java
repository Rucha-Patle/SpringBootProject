package com.SpringRest.SpringRest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.Dao.StudentDao;
import com.SpringRest.SpringRest.Entities.Students;

@Service
public abstract class services implements StudentServices
{
	@Autowired
	private StudentDao studDao;
	
	//List<Students> list;
	public services()
	{
	}
	@Override
	public List<Students> getStudentData()
	{
		return studDao.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Students getStudentID(long studID) {
		
		return studDao.getOne(studID); 
	}
	
	@Override
	public Students addStudent(Students s1)
	{
		studDao.save(s1);
		return s1;
	}
	
	@Override
	public Students updateStudData(Students s2)
	{
		studDao.save(s2);           //if stud Data is already present then it will updated otherwise new data added by save() 
		return s2;
	}
	@Override
	public void deleteStudData(long parseLong)
	{
		Students entity=studDao.getOne(parseLong);
		studDao.delete(entity);
	}

}
