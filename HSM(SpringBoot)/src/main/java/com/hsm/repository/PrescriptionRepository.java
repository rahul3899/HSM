package com.hsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.hsm.model.Prescription;
@Component
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer>{

}
