package com.hsm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.hsm.model.Appointment;
@Component
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {


	List<Appointment> findByDoctorName(String doctorName);

	List<Appointment> findByPatientName(String patientName);
}
/*
	@Query("update appointment a set a.confirmed = ?1 where a.appointment_id = ?2")
	int setConfirmation(String confitmation, Integer id);



	@Query("update appointment a set a.prescription = ?1 where a.appointment_id = ?2")
	int setPrescription(String prescription, Integer id);

	@Query(value="select * from appointment a where a.appointment_date =?1 AND a.doctor_name =?2", nativeQuery=true)
	List<Appointment> findByDate(String date,String doctorName);*/

