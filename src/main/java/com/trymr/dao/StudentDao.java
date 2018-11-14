package com.trymr.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	
		public Map<String,Object>   getStudentById(int id);
		public List<Map<String,Object>> getAll();
		public int  insert(int id,String name,String address);
		public  int update(String name,int id);
		public int  delete(int id);

	}


