package com.hsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.hsm.model.Patient;
@Component
public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
