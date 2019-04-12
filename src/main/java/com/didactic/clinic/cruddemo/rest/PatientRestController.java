package com.didactic.clinic.cruddemo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.didactic.clinic.cruddemo.entity.Patient;
import com.didactic.clinic.cruddemo.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientRestController {

	private PatientService patientService;
	
	@Autowired
	public PatientRestController(PatientService pacientService) {
		super();
		this.patientService = pacientService;
	}

	@GetMapping("/patients")
	public List<Patient> getPatients(){
		return patientService.getPatients();
	}
	
	@GetMapping("/patients/{id}")
	public Patient getPatient(@PathVariable int id){
		Patient patient = patientService.getPatient(id);
		
		if(patient==null) {
			throw new RuntimeException("Patient ["+id+"] not found");
		}
			
		return patient;	
	}
	
	@PostMapping("/patients")
	public Patient savePatient(@RequestBody Patient patient){
		patient.setId(0);
		patientService.save(patient);
		return patient;
	}	

	@PutMapping("/patients")
	public Patient updatePatient(@RequestBody Patient patient){
		patientService.save(patient);
		return patient;
	}	
	
	@DeleteMapping("/patients/{id}")
	public Patient deletePatient(@PathVariable int id){
		
		Patient patient = patientService.getPatient(id);
		patientService.deleteById(id);
		return patient;
	}
	
}
