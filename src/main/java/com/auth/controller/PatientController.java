package com.auth.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.auth.model.Patient;
import com.auth.service.PatientServices;



@RestController
@RequestMapping(value = "rest")
public class PatientController {
	@Autowired
	PatientServices patientServices;
	Patient patient=new Patient();
	
	private static String UPLOADED_FOLDER = "C://uploadedFiles//";
	
	@GetMapping(value="/patients")
	public List<Patient> getPatient() {
		return patientServices.getPatient();
	}	
	@GetMapping(value="/patients/{id}")
	public Patient getPatientbyId( @PathVariable("id") int id) {
		return patientServices.getPatientbyId(id);
	}
	@PostMapping(value="create")
	public List<Patient> createPatient(@RequestBody Patient pat) {
		return patientServices.createPatient(pat);	
	}
	
	@PostMapping(value=("/employees/upload"))
	public List<Patient> createuploadEmplyoee(@RequestParam("file") MultipartFile file,@RequestParam("patient_Id") int patient_Id,@RequestParam("first_Name") String first_Name,@RequestParam("last_Name") String last_Name,@RequestParam("age") String age,@RequestParam("dob") Date dob,@RequestParam("gender") String gender,
			@RequestParam("address") String address,@RequestParam("city") String city,@RequestParam("tel_No") long tel_No,@RequestParam("cell_No") long cell_No,@RequestParam("email_Id") String email_Id,@RequestParam("marital_Status") String marital_Status,
			String occupation, String family_Physician, String referring_Physician, String emergency_Contact,
			@RequestParam("relationship") String relationship,
			RedirectAttributes redirectAttributes)
            {
		if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            
        }
        try {           
        	
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
           
            patient.setFirst_Name(first_Name);
            patient.setLast_Name(last_Name);
            patient.setAge(age);
            patient.setAddress(address);
            patient.setCell_No(cell_No);
            patient.setCity(city);
            patient.setDob(dob);
            patient.setEmail_Id(email_Id);
            patient.setGender(gender);
            patient.setEmergency_Contact(emergency_Contact);
            patient.setMarital_Status(marital_Status);
            patient.setOccupation(occupation);
            patient.setPatient_Id(patient_Id);
            patient.setFamily_Physician(family_Physician);
            patient.setReferring_Physician(referring_Physician);
            patient.setRelationship(relationship);
            patient.setTel_No(tel_No);
            
            patient.setPhoto(bytes);         
                                    
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

		return patientServices.createPatient(patient);
		
	}
	
	@PutMapping(value = "/patients/{id}")
	public List<Patient> updatePatient(@RequestBody Patient pat, @PathVariable("id") int id) {
		return patientServices.updatePatient(pat,id);		
	}
}
