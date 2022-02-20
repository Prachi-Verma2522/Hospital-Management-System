package com.prachi.projectjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prachi.projectjava.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
