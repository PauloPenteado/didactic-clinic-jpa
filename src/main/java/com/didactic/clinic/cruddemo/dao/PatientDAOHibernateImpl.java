package com.didactic.clinic.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.didactic.clinic.cruddemo.entity.Patient;

@Repository
public class PatientDAOHibernateImpl implements PatientDAO {

	private EntityManager entityManager;
	
	@Autowired
	public PatientDAOHibernateImpl(EntityManager em) {
		entityManager = em;
	}
	
	@Override
	public List<Patient> getPatients() {

		Session currentSession = entityManager.unwrap(Session.class);
		 
		Query<Patient> query = currentSession.createQuery("from Patient", Patient.class);
		
		List<Patient> pacients = query.getResultList();
		
		return pacients;
	}

	@Override
	public Patient getPatient(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Patient pacient = currentSession.get(Patient.class, id);
		
		return pacient;
	}

	@Override
	public void save(Patient patient) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(patient);
	}


	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Patient> query = currentSession.createQuery("delete from Patient where id= :patientId");
		query.setParameter("patientId", id);
		query.executeUpdate();

	}


}
