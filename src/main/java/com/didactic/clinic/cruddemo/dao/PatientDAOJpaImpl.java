package com.didactic.clinic.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.didactic.clinic.cruddemo.entity.Patient;

@Repository
// to change the implementation to Hibernate, 
//just move @Primary to PatientDAOHibernateImpl
@Primary
public class PatientDAOJpaImpl implements PatientDAO {

	private EntityManager entityManager;
	
	@Autowired
	public PatientDAOJpaImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Patient> getPatients() {
		Query query = entityManager.createQuery("from Patient");
		List<Patient> patients = query.getResultList();
		return patients;
	}

	@Override
	public Patient getPatient(int id) {
		Patient patient = entityManager.find(Patient.class, id);
		return patient;
	}

	@Override
	public void save(Patient patient) {
		//save or update 
		Patient dbPatient = entityManager.merge(patient);
	}

	@Override
	public void deleteById(int id) {
		Query query = entityManager.createQuery("delete from Patient where id=:patientID");
		query.setParameter("patientID", id);
		query.executeUpdate();
	}


}
