package com.didactic.clinic.cruddemo.service;

import java.util.List;

import com.didactic.clinic.cruddemo.entity.Patient;

public interface PatientService {

	public List<Patient> getPatients();
	
	public Patient getPatient(int id);
	
	public void save(Patient patient);
	
	public void deleteById(int id);
	
}
