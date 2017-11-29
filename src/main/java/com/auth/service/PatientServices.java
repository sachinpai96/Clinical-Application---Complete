package com.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.auth.model.Patient;
import com.auth.repository.PatientRepository;



@Service
public class PatientServices {
	@Autowired
	PatientRepository patientRepository;

	public List<Patient> getPatient() {		
		return patientRepository.findAll();
		
	}	

	public Patient getPatientbyId( @PathVariable("id") int id) {
		return patientRepository.findOne(id);

	}

	public List<Patient> createPatient(@RequestBody Patient pat) {
		patientRepository.save(pat);
		return patientRepository.findAll();

	}

	public List<Patient> updatePatient(@RequestBody Patient pat, @PathVariable("id") int id) {
		patientRepository.save(pat);
		return patientRepository.findAll();	

	}

}
