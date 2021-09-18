package com.hsm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsm.model.Admin;
import com.hsm.model.Doctor;
import com.hsm.model.Patient;
import com.hsm.repository.AdminRepository;
import com.hsm.repository.DoctorRepository;
import com.hsm.repository.PatientRepository;
@Controller
@RequestMapping("management")
public class HsmController {
	@Autowired
	PatientRepository patient;
	@Autowired
	DoctorRepository doctor;
	@Autowired
	AdminRepository admin;

	@RequestMapping("savePatient")
	public String savePatient(@ModelAttribute Patient pa) {
		;
		return"Data Saved";

	}
	@RequestMapping("showAllPatient")
	public List<Patient> getAllPatient(){

		return patient.findAll();
	}

	@RequestMapping("findPatientById/{id}")
	Optional<Patient> findPatietById(@PathVariable int id) {

		return patient.findById(id);
	}

	@PostMapping("savedoctor")
	String saveDoctor(Doctor d) {
		doctor.save(d);
		return "Doctor data saved";
	}

	@GetMapping("findDoctorById/{id}")
	Optional<Doctor> findDoctorById(@PathVariable String id){
		return doctor.findById(id);
	}

	@GetMapping("showAllDoctor")
	List<Doctor> doctorList(){

		return doctor.findAll();
	}

	@PostMapping("saveAdmin")
	String saveAdmin(Admin ad) {
		admin.save(ad);
		return "Admin details saved";

	}
	@GetMapping("getAllAdminDetails")
	List<Admin> listAdmin(){

		return admin.findAll();
	}
	@GetMapping("findAdminById/{id}")
	Optional<Admin> findAdmin(@PathVariable String id){
		return admin.findById(id);
	}
	
	
	
}
