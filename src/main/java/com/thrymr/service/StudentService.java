package com.thrymr.service;


import java.util.List;
import java.util.Map;

public interface StudentService {
	    public  Map<String,Object> fetchStudent(int id);
	    public List<Map<String,Object>> getAllStudentData();
	    public String registerStudent(int no,String name,String address);
	    public String updateName(String name,int id);
	    public String remove(int id);
		
	  
}
