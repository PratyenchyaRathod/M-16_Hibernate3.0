package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		StudentService obj= new StudentServiceImpl();
		Student student = new Student();
		//create
		student.setStudentId(101);
		student.setName("Pratyenchya");
		obj.addStudent(student);
		
		/*//retrive
		student=obj.findStudentById(101);
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getName());*/
		
		/*//update
		student=obj.findStudentById(101);
	    student.setName("Partyenchya Rathod");
	    obj.updateStudent(student);*/
		
		//delete
		/*student=obj.findStudentById(102);
		obj.removeStudent(student);*/
	    
	    
		
		
		
	}

}
