package com.uni.msordonance.Repository;

import com.uni.msordonance.Entities.Ordonance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdonanceRepository extends JpaRepository<Ordonance, Long> {
    List<Ordonance> findOrdonancesByIdPatient(Long idPatient);
}
