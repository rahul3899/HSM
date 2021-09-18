package com.hsm.controller;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.hsm.model.Doctor;
import com.hsm.repository.DoctorRepository;
@Controller

public class DoctorController {
	
	
	
	
	@Autowired
	DoctorRepository doctor;
	
	@RequestMapping("loginDoctorurl")
	ModelAndView login(@RequestParam("doctorId") String doctorId, @RequestParam("password") String password) {
		//remember you have to make to some changes 
		//like if ad is null think harder and you will remember
		System.out.println(doctorId);
		Doctor login=doctor.getById(doctorId);
		
		
		ModelAndView view=null; 
		//Doctor ad=doctor.getById(login.getDoctorId());
	
		if(login.getPassword().equals(password)) { 
			view= new ModelAndView(); 
			view.setViewName("Doctor");
			view.addObject("doctorn",login.getName());
		}

		else { 
			view= new ModelAndView("LoginDoctor","errorkey","Username or Password is wrong");


		} 
		return view;
	}
	@RequestMapping("doctorLoginUrl")
	String doctorLogin() {
		
		return "LoginDoctor";
	}
	
	
	
	
	@RequestMapping("saveDoctor")
	String saveDoctor(@ModelAttribute Doctor d) {
		System.out.println(d.getName());
		doctor.save(d);
		return "Home";
	}

	
	
	
	
	
	@RequestMapping("deleteDoctor")
	ModelAndView deleteDoctor(@RequestParam("id") String id) {
		Optional<Doctor> d=doctor.findById(id);
		ModelAndView view=null;
		if(d!=null) {
			doctor.deleteById(id);
			view=new ModelAndView("doctor","successs","Doctor Deleted");
			
		}
		else {
			view =new ModelAndView("doctor","errorkeyy","Doctor By that id not found. Enter correct Id to delete Doctor");
		}
		
		return view;
	}

}
