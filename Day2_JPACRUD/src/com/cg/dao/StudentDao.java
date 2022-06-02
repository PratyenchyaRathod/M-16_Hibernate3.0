package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	public abstract Student getStudentsById(int id); //retrive
	public abstract Student addStudent(Student student); //creation
	public abstract Student updateStudent(Student student); //update
	public abstract Student removeStudent(Student student);  //delete
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
