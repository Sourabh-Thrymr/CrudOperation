package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.thrymr.cnfg.AppConfig;
import com.thrymr.service.StudentService;
import com.thrymr.service.StudentServiceImp;
import com.trymr.dao.StudentDaoImp;

@SpringBootApplication
@Import(value= {StudentDaoImp.class,StudentServiceImp.class})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		StudentService service;
	  	service=ctx.getBean("service",StudentService.class);
        System.out.println(service.getAllStudentData());
	   System.out.println(service.registerStudent(11, "ravi", "delhi"));
	    System.out.println(service.fetchStudent(11));
		//System.out.println(service.remove(6));
		//System.out.println(service.updateName("ajay",4));
		
	}
}
