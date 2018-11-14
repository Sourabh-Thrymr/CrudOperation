package com.thrymr.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trymr.dao.StudentDaoImp;

@Service("service")
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDaoImp dao;
	
	@Override
	public Map<String,Object> fetchStudent(int id) {
		Map<String,Object> map=null;
		map=dao.getStudentById(id);
				return map;
	}

	@Override
	public String registerStudent(int no, String name, String address) {
		 int count=0;
			//use DAO
	           count=dao.insert(no, name, address);
				if(count==0)
					return "Student Registration failed";
				else
					return "Student Registration succeded";
	}

	@Override
	public String updateName(String name,int id) {
		System.out.println(id);
		System.out.println(name);
		int count=dao.update(name,id);
		if(count==0) {
		return "record not updated";
		}
		else {
			return "record updated";
		}
		  
	}

	
	public String remove(int id) {
		 int count=0;
			//use DAO
		  count=dao.delete(id);
		   if(count==0)
			   return "student not found";
		   else
			   return "Studennt fired";
	}

	@Override
	public List<Map<String, Object>> getAllStudentData() {
		List<Map<String, Object>> list=dao.getAll();
	return list;
	}

//	@Override
//	public List<Map<String, Object>> getAllStudentData() {
//		List<Map<String, Object>> list=dao.getAllStudent();
//		return list;
//	}

}
