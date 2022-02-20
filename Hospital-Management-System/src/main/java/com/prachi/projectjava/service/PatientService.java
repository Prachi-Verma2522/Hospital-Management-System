package com.prachi.projectjava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prachi.projectjava.entity.Patient;
import com.prachi.projectjava.repository.PatientRepo;


@Service
public class PatientService {
	
	@Autowired
	private PatientRepo repo;
	
	public void addPatient(Patient p) {
		repo.save(p);				
	}
	
	public List<Patient> getAllPatient(){
		return repo.findAll();
	}
	
	public Patient getPatientById(int id) {
		Optional<Patient> p = repo.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}
	
	public void deletePatient(int id) {
		repo.deleteById(id);
	}
}
