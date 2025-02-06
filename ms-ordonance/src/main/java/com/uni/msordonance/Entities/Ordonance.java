package com.uni.msordonance.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uni.msordonance.DTO.PatientDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor @Entity
@Builder
public class Ordonance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOrdonance;

    private Date dateOrdonance;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "ordonance", cascade = CascadeType.ALL)
    private List<Medicament> medicaments;

    private Long idPatient;

    @Transient
    private PatientDTO patientDTO;



}
