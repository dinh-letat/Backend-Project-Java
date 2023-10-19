package com.example.springformmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springformmvc.entities.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	List<Student> list;
	int count = 3;
	public StudentController() {
		list = new ArrayList<Student>();
		list.add(new Student(1, "Dinh", "Le Tat", 21));
		list.add(new Student(1, "Dinh", "Le Tat", 21));
		list.add(new Student(1, "Dinh", "Le Tat", 21));
	}
	
	@RequestMapping("/studentform")
	public ModelAndView showForm() {
		 return new ModelAndView("studentform", "command", new Student());
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("student" )Student sv) {
		int id = count++;
		String fname = sv.getFname();
		String lname = sv.getLname();
		int age = sv.getAge();
		sv = new Student(id, fname, lname, age);
		list.add(sv);
		return new ModelAndView("viewstudent", "list", list);
	}
	
	@RequestMapping("/viewstudetn")
	public ModelAndView viewstudent() {
		return new ModelAndView("viewstudent", "list", list);
	}
}
