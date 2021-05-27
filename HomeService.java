package com.singlepage.student.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.singlepage.student.main.model.Student;

@Service
public interface HomeService {

	String addstudent(Student stu);

	List<Student> getAllDetails();

	Student editData(int id);

	List<Student> updateStudentData(Student s);

	List<Student> deleteStudent(int id);

}
