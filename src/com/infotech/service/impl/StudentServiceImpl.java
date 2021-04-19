package com.infotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infotech.dao.StudentDAO;
import com.infotech.model.Student;
import com.infotech.service.StudentService;

@Service(value = "studentDAO")
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	@Override
	public boolean registerStudent(Student student) {
		return studentDAO.saveStudent(student);
	}

	@Override
	public List<Student> getListStudent() {
		List<Student> student = getStudentDAO().getListStudent();
		return student;
	}

	@Override
	public List<Student> getListStudentValidation() {
		List<Student> student = getStudentDAO().getListStudentValidation();
		return student;
	}

	@Override
	public void updateValider(int id) {
		getStudentDAO().updateValider(id);
	}
}
