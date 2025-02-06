package com.uni.mspatient.Repository;

import com.uni.mspatient.Entities.AntecedentMedical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AntecedentRepository extends JpaRepository<AntecedentMedical, Long> {
}
