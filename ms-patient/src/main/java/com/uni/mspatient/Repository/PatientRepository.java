package com.uni.mspatient.Repository;

import com.uni.mspatient.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
