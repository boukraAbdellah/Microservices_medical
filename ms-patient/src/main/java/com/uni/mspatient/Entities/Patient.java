package com.uni.mspatient.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private String nom;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private java.util.List<AntecedentMedical> antecedents;



}
