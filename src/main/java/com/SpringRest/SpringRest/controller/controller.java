package com.SpringRest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringRest.Entities.Students;
import com.SpringRest.SpringRest.Services.StudentServices;

//Rest- Representational state transfer 
@RestController            //this tells to spring boot that we have created a controller class
public class controller {
	
	@Autowired
	private StudentServices studservice;
	private Object Students;
	
	//get Student Data
	@GetMapping("/Students")
	public List<Students> getStudentData()
	{
		return this.studservice.getStudentData();
	}
	
	@GetMapping("/Students/{studID}")
	public Students getStudentID(String studID)
	{
		return this.studservice.getStudentID(Long.parseLong(studID));
	}
	
	@PostMapping("/Students")
	public Students addStudent(@RequestBody Students s1)
	{
		return this.studservice.addStudent(s1);
	}
	
	//update student data using put
	@PutMapping("/Students")
	public  Students updateStudData(@RequestBody Students s2)
	{
		return this.studservice.updateStudData(s2);
		
	}
	
	//delete the student data
	@DeleteMapping("/Students/{studID}")
	public ResponseEntity<HttpStatus> deleteStudData(@PathVariable String studID)
	{
		try {
			((StudentServices) this.Students).deleteStudData(Long.parseLong(studID));
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
