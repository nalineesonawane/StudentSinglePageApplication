package com.singlepage.student.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.singlepage.student.main.model.Student;
import com.singlepage.student.main.repository.StudentRepository;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	private StudentRepository sr;
	
	@Override
	public String addstudent(Student stu) {
		sr.save(stu);
		return "Student Added Successfully..!!";
		
		
	}

	@Override
	public List<Student> getAllDetails() {
		List<Student> list = (List<Student>) sr.findAll();
		return list;
	}

	@Override
	public Student editData(int id) {
		Student s = sr.findById(id).get();
		return s;
	}

	@Override
	public List<Student> updateStudentData(Student s) {
		sr.save(s);
		System.out.println(" data is updated");
		return (List<Student>) sr.findAll();
	}

	@Override
	public List<Student> deleteStudent(int id) {
		sr.deleteById(id);
		System.out.println(" Details  is deleted");
		return (List<Student>) sr.findAll();
	}

}
