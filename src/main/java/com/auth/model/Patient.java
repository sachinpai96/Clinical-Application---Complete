package com.auth.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity
public class Patient {
	@Id
	@Column(name="patient_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patient_Id;

	@Column(name="first_Name")
	private String first_Name;

	@Column(name="last_Name")
	private String last_Name;

	@Column(name="age")
	private String age;

	@Column(name="dob")
	private Date dob;

	@Column(name="gender")
	private String gender;

	@Column(name="address")
	private String address;

	@Column(name="city")
	private String city;

	@Column(name="tel_No")
	private long tel_No;

	@Column(name="cell_No")
	private long cell_No;

	@Column(name="email_Id")
	private String email_Id;

	@Column(name="marital_Status")
	private String marital_Status;

	@Column(name="occupation")
	private String occupation;

	@Column(name="family_Physician")
	private String family_Physician;

	@Column(name="referring_Physician")
	private String referring_Physician;

	@Column(name="emergency_Contact")
	private String emergency_Contact;

	@Column(name="relationship")
	private String relationship;
	
	@Lob
	@Column(name="photo")
	private byte[] photo;
		
	
	

	public Patient() {

	}

	public Patient(int patient_Id, String first_Name, String last_Name, String age, Date dob, String gender,
			String address, String city, long tel_No, long cell_No, String email_Id, String marital_Status,
			String occupation, String family_Physician, String referring_Physician, String emergency_Contact,
			String relationship) {
		super();
		this.patient_Id = patient_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.tel_No = tel_No;
		this.cell_No = cell_No;
		this.email_Id = email_Id;
		this.marital_Status = marital_Status;
		this.occupation = occupation;
		this.family_Physician = family_Physician;
		this.referring_Physician = referring_Physician;
		this.emergency_Contact = emergency_Contact;
		this.relationship = relationship;
	}

	public int getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getTel_No() {
		return tel_No;
	}

	public void setTel_No(long tel_No) {
		this.tel_No = tel_No;
	}

	public long getCell_No() {
		return cell_No;
	}

	public void setCell_No(long cell_No) {
		this.cell_No = cell_No;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getMarital_Status() {
		return marital_Status;
	}

	public void setMarital_Status(String marital_Status) {
		this.marital_Status = marital_Status;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getFamily_Physician() {
		return family_Physician;
	}

	public void setFamily_Physician(String family_Physician) {
		this.family_Physician = family_Physician;
	}

	public String getReferring_Physician() {
		return referring_Physician;
	}

	public void setReferring_Physician(String referring_Physician) {
		this.referring_Physician = referring_Physician;
	}

	public String getEmergency_Contact() {
		return emergency_Contact;
	}

	public void setEmergency_Contact(String emergency_Contact) {
		this.emergency_Contact = emergency_Contact;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
}
