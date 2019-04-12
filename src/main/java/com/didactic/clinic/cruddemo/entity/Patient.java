package com.didactic.clinic.cruddemo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone1")
	private String phone1;
	
	@Column(name="phone2")
	private String phone2;
	
	@Column(name="birth_date")
	private Timestamp birthDate;
	
	@Column(name="blood_type")
	private String bloodType;
	
	@Column(name="national_id")
	private String nationalId;

	public Patient() {
		
	}
		
	public Patient(String firstName, String lastName, String bloodType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bloodType = bloodType;
	}

	public Patient(String firstName, String lastName, String email, String phone1, String phone2, Timestamp birthDate,
			String bloodType, String nationalId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.birthDate = birthDate;
		this.bloodType = bloodType;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	@Override
	public String toString() {
		return "pacient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", birthDate=" + birthDate + ", bloodType=" + bloodType
				+ ", nationalId=" + nationalId + "]";
	}
	
}
