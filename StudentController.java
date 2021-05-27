package com.singlepage.student.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.singlepage.student.main.model.Student;
import com.singlepage.student.main.service.HomeService;

@RestController
public class StudentController {
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/addstudent")
	public String addstudent(@RequestBody Student stu)
	{
		System.out.println("Details to insert :"+stu);
		String stu1=hs.addstudent(stu);
		return stu1;

}
	
	@GetMapping("/getallstudentdetails") public List<Student> getAllDetails()
	  {
		  List<Student> slist=hs.getAllDetails();
		  return slist;
		  
	  }
	  
	  
	  @GetMapping("/editdata/{Id}") public Student
	  editDealer(@PathVariable("Id") int id) 
	  {
		  Student s1 =hs.editData(id); 
		  System.out.println(" Data to edit : "+s1);
	      return s1; 
	  }
	  
	  @PutMapping("/updatedata")
	  public List<Student>updateData(@RequestBody Student s) {
	  System.out.println("In HC Update "); 
	  List<Student> slist =hs.updateStudentData(s);
	  return slist; 
	  }
	  
	  @DeleteMapping("/deletedetails/{id}")
	  public List<Student>  deleteData(@PathVariable ("id")int id) 
	  {
		  List<Student> dlist =  hs.deleteStudent(id); 
		  return dlist; 
		  
	  }
	 
}