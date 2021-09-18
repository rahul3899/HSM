package com.hsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hsm.model.Admin;

import com.hsm.repository.AdminRepository;

@Controller
public class AdminController {

	@Autowired
	AdminRepository admin;
	@RequestMapping("adminLoginPage")
	String admninLoginPage() {
		return "AdminLogin";
	}
	
	
	
	@RequestMapping("loginAdmin")
	ModelAndView login(@RequestParam("username") String usernane, @RequestParam("password") String password) {
		//remember you have to make to some changes 
		//like if ad is null think harder and you will remember
		Admin login=admin.getById(usernane);
		
		ModelAndView view=null; 
		//Doctor ad=doctor.getById(login.getDoctorId());
	
		if(login.getPassword().equals(password)) { 
			view= new ModelAndView(); 
			view.setViewName("Admin");
			view.addObject("adminn",login.getName());
		}

		else { 
			view= new ModelAndView("AdminLogin","errorkey","Username or Password is wrong");


		} 
		return view;
	}
	@RequestMapping("saveAdmin")
	String saveAdmin(@ModelAttribute Admin ad) {
		admin.save(ad);
		return "Admin";
		//I have to create one page to save admin remember that
	}





}
