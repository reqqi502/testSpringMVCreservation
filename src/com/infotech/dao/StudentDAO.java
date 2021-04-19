package com.infotech.dao;

import com.infotech.model.Student;

import java.util.*;

public interface StudentDAO {
	public abstract boolean saveStudent(Student student);
	public List<Student> getListStudent();
	public void updateValider(int id);
	List<Student> getListStudentValidation();

                                                    }
