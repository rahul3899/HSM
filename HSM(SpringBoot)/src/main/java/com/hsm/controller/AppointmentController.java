package com.hsm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hsm.model.Appointment;
import com.hsm.repository.AppointmentRepository;



@Controller
public class AppointmentController {
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@RequestMapping("saveAppointment")
	String saveAppointment(@ModelAttribute Appointment app) {
		appointmentRepository.save(app);
		return "Reception";
	}
		@RequestMapping("findAppointmentById")
		ModelAndView findAppoinment(@RequestParam("id") int id) {
		Appointment appointment=appointmentRepository.getById(id);
		ModelAndView view=null;
			if(appointment!=null) {
			view=new ModelAndView("myAppointments","user",appointment);
			}
			else {
				view =new ModelAndView("Reception","errorkey","The appointment ID is incorrect");
			}
			return view;
		}
		@RequestMapping("showAllAppoitment")
		ModelAndView allAppointment() {
			List<Appointment> appointment=	appointmentRepository.findAll();
			ModelAndView view=null;
				if(appointment!=null) {
				view=new ModelAndView("DisplayAllAppointments","AllAppointment",appointment);
				}
				else {
					view =new ModelAndView("Reception","error","Appointment List is Empty");
				}
				return view;
			}
		
	}
	
	


