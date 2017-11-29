package com.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.auth.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	@Query(value = "SELECT p FROM Patient p WHERE patient_Id = ?1")
	List<Patient> getPatientbyId(int id);
}
