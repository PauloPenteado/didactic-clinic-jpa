package com.didactic.clinic.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.didactic.clinic.cruddemo.dao.PatientDAO;
import com.didactic.clinic.cruddemo.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	private PatientDAO patientDAO;
	
	@Autowired
	public PatientServiceImpl(PatientDAO patientDAO) {
		super();
		this.patientDAO = patientDAO;
	}

	@Override
	@Transactional
	public List<Patient> getPatients() {
		return patientDAO.getPatients();
	}

	@Override
	@Transactional
	public Patient getPatient(int id) {
		return patientDAO.getPatient(id);
	}

	@Override
	@Transactional
	public void save(Patient patient) {
		patientDAO.save(patient);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		patientDAO.deleteById(id);
	}

}
