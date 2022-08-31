package com.SpringRest.SpringRest.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringRest.SpringRest.Entities.Students;

@SuppressWarnings("unused")
public interface StudentServices {
	public List<Students> getStudentData();
	
	public Students getStudentID(long studID);
	
	public Students addStudent(Students s1);

	public Students updateStudData(Students s2);
	
	public  void deleteStudData(long parseLong);

}
