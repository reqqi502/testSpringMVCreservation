package com.infotech.service;

import java.util.*;
import com.infotech.model.Student;
public interface StudentService {
	public abstract List<Student> getListStudent();
	public abstract boolean registerStudent(Student student);
	void updateValider(int id);
	List<Student> getListStudentValidation();
	
}