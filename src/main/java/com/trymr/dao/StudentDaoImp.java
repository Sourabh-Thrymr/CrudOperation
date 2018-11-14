package com.trymr.dao;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImp implements StudentDao {
	
	private static final String getByNo="Select id,name,address from Student where id=?";
	private static final String getAll="SELECT ID,NAME,ADDRESS FROM STUDENT";
	private static final String insertStudent="INSERT INTO STUDENT(ID,NAME,ADDRESS) VALUES(?,?,?)";
	private static final String updateStudent="UPDATE STUDENT SET NAME=? WHERE ID=?";                                         
	private static final String deleteStudent="DElETE FROM STUDENT WHERE ID=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public Map<String,Object>  getStudentById(int id)
	{
		 Map<String,Object> map=null;
	     map=jt.queryForMap(getByNo,id);
			return map;
	}
	
	
	public int  insert(int id,String name,String address) {
		int count=0;
		count=jt.update(insertStudent,id,name,address);
		return count;
	}
	public  int update(String name,int id) {
		System.out.println(id);
		System.out.println(name);
		int count=0;
		count=jt.update(updateStudent,name,id);
		return count;
	}
	public int  delete(int id) {
		int count=0;
		//use dAO
		count=jt.update(deleteStudent, id);
		return count;
	}


	@Override
	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> list=jt.queryForList(getAll);
		return list;
	}
	

}
